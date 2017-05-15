package AccessOuterClassMethodsFromInnerClass;

public class OuterClass {
	private static int x = 50;
	private int y;
	
	OuterClass(int y){
		this.y = y;
	}
	
	public void f1() {
		System.out.println("Inside outer non static method");
	}

	 public class InnerClass {
		 private int y;
		 
		 InnerClass(int y){
			 this.y = y;
		 }
		 
		public void f2() {
			System.out.println("Inside inner non static method");
			System.out.println("Outer class x : "+OuterClass.x);
			System.out.println("Outer classes y : "+OuterClass.this.y);
			System.out.println("Inner class y : "+this.y);
		}
	}

	public static void main(String[] args) {

		OuterClass outer = new OuterClass(80);
		outer.f1();
		 
		OuterClass.InnerClass inner = outer.new InnerClass(30);
		inner.f2();
		
	}
}
