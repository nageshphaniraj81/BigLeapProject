package StringComparator;

import java.util.Comparator;

public class StringComparator implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		if(s1.length()>s2.length()){
			return 1;
		}else if(s1.length()<s2.length()){
			return -1;
		}else{
			s1.compareTo(s2);
		}
		return 0;
	}
	

}
