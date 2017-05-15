package JVMArchitecture;

import java.lang.reflect.Method;

public class TestClass {

	public static void main(String[] args) throws ClassNotFoundException {

		@SuppressWarnings("unchecked")
		Class<User> class1 = (Class<User>)Class.forName("JVMArchitecture.User");
		Method[] methods = class1.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println("Method name :"+method.getName());
		}
	    System.out.println("Number of methods : "+methods.length);
		
	}

}
