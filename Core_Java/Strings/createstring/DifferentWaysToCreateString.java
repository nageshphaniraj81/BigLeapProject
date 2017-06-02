package createstring;

public class DifferentWaysToCreateString {

	public static void main(String[] args) {

		String s1 = "six";
		
		// Passing string value to the constructor
		String s2 = new String("seven");
		
		// Passing character array to the string constructor
		char c [] = {'a','e','i','o','u'};
		String s3 = new String(c);
		
		// passing byte array to the string onstructor
		byte b [] = {65,66,67};
		String s4 = new String (b);
		
		// Display strings 
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
	}

}
