package uncheckedexception;

public class DemoNullPointerException {

	static DemoArrayIndexOutofBoundException d;

	public static void main(String[] args) {
		
		try{
		DemoNullPointerException.d.method1();
		}catch(NullPointerException e){
			// Results in null pointer exception as the object has not been created 
			// using new keyword
			System.out.println("Null pointer exception");
		}
		System.out.println("code after exception");
	}

}
