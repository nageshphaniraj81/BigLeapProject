package staticmembers;

public class StaticMethodsDemo {

	// Main method that calls static methods
	public static void main(String[] args) {
		System.out.println("Inside Main");
		StaticMethodsDemo.method1();
		StaticMethodsDemo.method2();
	}

	// Static method
	static void method1() {
		System.out.println("Inside method 1");
	}
	
	// Static method 
	static void method2(){
		System.out.println("Inside method 2");
	}
	
	// static method that is not called
	static void method3(){
		System.out.println("Hi");
	}
	
	// Static block whic calls static method
	static{
		System.out.println("Inside static block");
		StaticMethodsDemo.method1();

	}

}
