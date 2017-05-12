
package wrapperclasses;

public class AllInOne {

	public static void main(String[] args) {

		int x  = 100;
		
		// convert into string
		String y = Integer.toString(x);
		
		// To create a new Integer object form the string
		Integer z = new Integer(y);
		
		// Convert object back to primitive type
		int i = z.intValue();
		
		// convert primitive to object ( second constructor)
		Integer c = new Integer(i);
		
		// Integer object to String 
		String d  = c.toString();
		
		// convert string to primitive type
		int e = Integer.parseInt(d);
		
	}

}
