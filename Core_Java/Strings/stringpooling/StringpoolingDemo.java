package stringpooling;

public class StringpoolingDemo {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = "abcd";
		String s3 = "abc";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
				
	}

}
