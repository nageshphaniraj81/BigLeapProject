package LocalInnerClass;

public class ClassInAOuterClassMethod {
	
	public void f1(){
		System.out.println("Inside Outer Class f1 method ");
	
		//**************************************************************
		abstract class Inner{
			void f2(){
				System.out.println("Inside inner class f2 method");
			}
			abstract void f3();
		}
		
		 class I extends Inner{

			@Override
			void f3() {
				System.out.println("Inside child class of Inner class");
			}
		}
		//*****************************************************************
		
       I i = new I();
       i.f3();
       i.f2();
		
	}

	public static void main(String[] args) {
		ClassInAOuterClassMethod outer = new ClassInAOuterClassMethod();
		outer.f1();
	}

}
