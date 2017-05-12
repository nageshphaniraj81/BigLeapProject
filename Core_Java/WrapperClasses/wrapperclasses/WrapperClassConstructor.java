package wrapperclasses;

public class WrapperClassConstructor {

	public static void main(String[] args) {

		// Passing int value to Wrapper class constructor
        int x = 100;
        Integer y = new Integer(x);
        System.out.println(y.intValue());
        
        // Passing String to Integer Wrapper Constructor
        String a = "2000";
        Integer b = new Integer(a);
        System.out.println(b.toString());
        System.out.println(b.intValue());

	}

}
