package StringBufferComparator;

import java.util.Comparator;

public class SBComparator implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer arg0, StringBuffer arg1) {
		// TODO Auto-generated method stub
		String s1 = arg0.toString();
		String s2 = arg1.toString();
		return s1.compareTo(s2);
	}
	
	

}
