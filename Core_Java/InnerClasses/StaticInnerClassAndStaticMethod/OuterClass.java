package StaticInnerClassAndStaticMethod;

public class OuterClass {
	
	public static void f1(){
		System.out.println("Inside static outer method");
	}
	
	static class InnerClass{
		public static void f1(){
			System.out.println("Inside inner static method");
		}	
	}

	public static void main(String[] args) {
		OuterClass.f1();
		OuterClass.InnerClass.f1();
      
	}

}
