package StringBufferComparator;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetForStringBuffer {

	public static void main(String[] args) {

		Set<StringBuffer> set = new TreeSet<>(new SBComparator());
		set.add(new StringBuffer("abcxyz"));
		set.add(new StringBuffer("defrerwrwerw"));
		set.add(new StringBuffer("xyz"));
		set.add(new StringBuffer("xyziiiii"));
		
		for (StringBuffer string : set) {
			System.out.println(string);
		}
		
		
	}

}
