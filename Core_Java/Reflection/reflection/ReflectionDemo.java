package reflection;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class<Person> PersonClass = null;
		PersonClass = (Class<Person>) Class.forName("reflection.Person");
		
		// To display class name
		System.out.println(PersonClass.getName());
		
		// To display Package
		System.out.println(PersonClass.getPackage());
		
		// To display fields
		System.out.println("To display fields");
		Field[] fields =  PersonClass.getFields();
		for (Field field : fields) {
			System.out.println(field.getName()+" Type: "+field.getType());
		}
		System.out.println();
		
		// To display Methods
		System.out.println("To display methods");
		Method[] methods = PersonClass.getMethods();
		for (Method method : methods) {
			System.out.println("Methods :"+method.getName()+" Return type :"+method.getReturnType());
		}
		System.out.println();
		
		// To display fields
		System.out.println("To display Private fields");
		Field[] privateFields =  PersonClass.getDeclaredFields();
		for (Field field : privateFields) {
			field.setAccessible(true);
			System.out.println(field.getName()+" Type: "+field.getType());
		}
		System.out.println();
		
		// To display private methods
		System.out.println("To display private methods");
		Method[] privateMethods = PersonClass.getDeclaredMethods();
		for (Method method : privateMethods) {
			method.setAccessible(true);
			System.out.println("Methods :"+method.getName()+" Return type :"+method.getReturnType());
		}
		System.out.println();
		
		// To display superclass
		System.out.println(PersonClass.getSuperclass().getName());
		System.out.println();
		
		// To Find out Interfaces
		Class[] Interfaces = PersonClass.getInterfaces();
		for (Class class1 : Interfaces) {
			System.out.println(class1.getName());
		}
		
		// To display Methods
		System.out.println("To display annotation methods");
		Method[] aMethods = PersonClass.getMethods();
		for (Method method : aMethods) {
			if(method.isAnnotationPresent(MyAnnotation.class)){
					System.out.println("Methods :"+method.getName());
			}
		}
		System.out.println();
	}

}

class Human{
	
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
		public String name();
}

class Person extends Human implements Comparable<Person>,Serializable{
	public String name;
	public int age;
	private int weights;
	private int heights;
	
	
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private int getAge() {
		return age;
	}
	private void setAge(int age) {
		this.age = age;
	}
	
	@MyAnnotation(name="MyAnnotation")
	public String returnName(){
		return "Hello"+this.name;
	}
	
	@Override
	public int compareTo(Person arg0) {
		return 0;
	}
}
