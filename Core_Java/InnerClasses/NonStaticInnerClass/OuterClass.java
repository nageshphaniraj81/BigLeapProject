package NonStaticInnerClass;

public class OuterClass {
	
	public void f1() {
		System.out.println("Inside outer non static method");
	}

	 public class InnerClass {
		public void f2() {
			System.out.println("Inside inner non static method");
		}
	}

	public static void main(String[] args) {

		OuterClass outer = new OuterClass();
		outer.f1();
		 
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.f2();
		
	}
}
