package wrapperclasses;

public class PrimitiveAndObject {

	public static void main(String[] args) {

		// Converting from int to Integer
		int x = 100;
		Integer y = Integer.valueOf(x);

		// Converting from Integer to int
		int z = y.intValue();
		System.out.println(z);

		// Converting from byte to Byte
		byte g = 50;
		Byte h = Byte.valueOf(g);

		// converting back to byte from Byte
		byte i = h.byteValue();
		System.out.println(i);

		// Convering form double to Double
		double l = 100.78;
		Double d = Double.valueOf(l);

		// Converting back to double from Double
		double e = d.doubleValue();
		System.out.println(e);
	}

}
