package genericmethodsdeom;

public class App {

	public static void main(String[] args) {
		GenericMethod gm = new GenericMethod();
		System.out.println("Value returned by generic method is "+gm.returnStore(99.5));
		
		Integer[] intArray = {1,2,4,5,9,};
		String[] stringArray = {"Nagesh","Anusha","nana","sam"};
		gm.returnArray(stringArray);
		
	}

}
