package Locale;
import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		
		//To get the default locale
		Locale l = Locale.getDefault();
		System.out.println(l.getCountry());
		System.out.println(l.getLanguage());
		System.out.println(l.getDisplayCountry());
		System.out.println(l.getDisplayLanguage());
		
		Locale.setDefault(Locale.UK);
		System.out.println(l.getDisplayCountry());
		System.out.println(l.getDisplayLanguage());
		
		String[] isoCountries = Locale.getISOCountries();
		for (String string : isoCountries) {
			System.out.print(string+"\t");
		}
		
		String[] isoLanguages = Locale.getISOLanguages();
		System.out.println();
		for (String string : isoLanguages) {
			System.out.print(string+"\t");
		}
	}

}
