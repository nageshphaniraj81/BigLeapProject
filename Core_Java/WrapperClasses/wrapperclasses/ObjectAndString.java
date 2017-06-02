package wrapperclasses;

public class ObjectAndString {

	public static void main(String[] args) {
	
		int x = 100;
		Integer y = Integer.valueOf(x);	
		String z = y.toString();
		
		// Convert String to int using Integer.parseInt
		int i = Integer.parseInt(z);
		System.out.println(i);

	}

}
