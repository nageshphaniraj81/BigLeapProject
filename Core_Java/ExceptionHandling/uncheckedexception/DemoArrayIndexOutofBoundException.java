package uncheckedexception;

public class DemoArrayIndexOutofBoundException {

	public static void main(String[] args) {
		int x[] = { 10, 20, 30 };
		
		try{
		for (int i = 0; i <= x.length; i++) {
			System.out.println(x[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Index beyond array length");
		}
		System.out.println("Code after array");
	}
	
	void method1(){
		System.out.println("Method 1");
	}

}
