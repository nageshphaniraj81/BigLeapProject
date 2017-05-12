package typecasting;

public class ExplicitCast {

	public static void main(String[] args) {

		// int to byte
		int i = 100;
		byte b = (byte)i;
		System.out.println(b);
		
		// int to char
		int x = 97;
		char ch = (char)x;
		System.out.println(ch);
		
		// int to byte
		int y = 130;
		byte z = (byte)y;
		System.out.println(z);
		
		//int to byte & byte to char
		int m = 612;
		byte n = (byte)m;
		System.out.println(n);
		
		
		char o = (char)n;
		System.out.println(o);
	}

}
