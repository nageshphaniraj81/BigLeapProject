package checkedexception;

public class DemoThrowKeyword {

	public static void main(String[] args) {

		try{
			// User purposely throws this exception
		throw new RuntimeException("Funds not found");
		}catch(RuntimeException e){
			System.out.println("Run time exception is now handled");
		}
	}

}
