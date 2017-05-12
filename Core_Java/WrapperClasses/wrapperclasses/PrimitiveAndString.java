package wrapperclasses;

public class PrimitiveAndString {

	public static void main(String[] args) {
		
		// byte to String -> String to byte
        byte x = 100;
        String s = Byte.toString(x);
        byte y =   Byte.parseByte(s);
        System.out.println(y);
        
        // int to string -> String to int
        int l = 200;
        String m = Integer.toString(l);
        int n = Integer.parseInt(m);
        System.out.println(n);
        
        // double to string -> String to double
        double p = 300.60;
        String q = Double.toString(p);
        double r = Double.parseDouble(q);
        System.out.println(r);
	}

}
