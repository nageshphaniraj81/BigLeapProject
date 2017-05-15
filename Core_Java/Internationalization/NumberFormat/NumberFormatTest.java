package NumberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {

	public static void main(String[] args) {
    
		Double d = 883883.44489;
		NumberFormat n = NumberFormat.getInstance();
		n.setMinimumFractionDigits(4);
		n.setMaximumFractionDigits(2);
		n.setMaximumIntegerDigits(10);
		System.out.println(n.format(d));
		
		
		Long l = 89983l;
		NumberFormat n2 = NumberFormat.getInstance(Locale.US);
		System.out.println(n2.format(l));
		
		NumberFormat n3 = NumberFormat.getInstance(Locale.UK);
		System.out.println(n3.format(l));
		
		
	}

}
