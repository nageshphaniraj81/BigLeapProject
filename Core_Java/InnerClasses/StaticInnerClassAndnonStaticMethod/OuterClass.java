package StaticInnerClassAndnonStaticMethod;

public class OuterClass {
	static class InnerClass {
		public void f2() {
			System.out.println("Inside inner non static method");
		}
	}

	public static void main(String[] args) {
		OuterClass.InnerClass inner = new OuterClass.InnerClass();
		inner.f2();
	}
}
