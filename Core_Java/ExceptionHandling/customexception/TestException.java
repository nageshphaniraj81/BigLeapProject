package customexception;

public class TestException {

	public static void main(String[] args) throws CheckedCustomException {

    // throw new UncheckedCustomException("Business exception");
	throw new CheckedCustomException("Business exception that needs to be handled");

	}

}
