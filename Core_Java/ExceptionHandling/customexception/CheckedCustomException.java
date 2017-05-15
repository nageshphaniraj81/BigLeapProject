package customexception;

public class CheckedCustomException extends Exception {
	
	CheckedCustomException (String s){
		System.out.println("This is a checked exception that needs to be handled");
	}

}
