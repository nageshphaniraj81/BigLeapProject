package DateFormat;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

	public static void main(String[] args) {
		
		Date d  = new Date();
		DateFormat usDF = DateFormat.getDateInstance(0,Locale.US);
		DateFormat ukDF = DateFormat.getDateInstance(0,Locale.UK);
		
		System.out.println("Date in US format : "+usDF.format(d));
		System.out.println("Date in UK format : "+ukDF.format(d));
		
		DateFormat timeInstance = DateFormat.getTimeInstance();
		System.out.println(timeInstance.format(d));
		
		DateFormat timeInstance2 = DateFormat.getTimeInstance(0);
		System.out.println(timeInstance2.format(d));
		
		DateFormat timeInstance3 = DateFormat.getTimeInstance(3);
		System.out.println(timeInstance3.format(d));
		
		DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(0, 0);
		System.out.println(dateTimeInstance.format(d));
		
	}
	
}
