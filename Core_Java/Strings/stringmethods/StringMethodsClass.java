package stringmethods;

public class StringMethodsClass {

	public static void main(String[] args) {
		String s = "Hello World";
		
		System.out.println("Length of the String is : " + s.length());
		System.out.println("Index of o is : " + s.indexOf('o'));
		System.out.println("Character at index 3 is : " + s.charAt(3));
		System.out.println("Substring with beginning index :" + s.substring(2));
		System.out.println("Substring with beginning & end index :" + s.substring(0, 4));
		
		String[] result = s.split(" ");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		System.out.println("Replace :"+s.replace('l', 'k'));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
	}

}
