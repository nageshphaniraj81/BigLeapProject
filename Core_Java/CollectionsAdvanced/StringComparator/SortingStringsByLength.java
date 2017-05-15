package StringComparator;

import java.util.Set;
import java.util.TreeSet;

public class SortingStringsByLength {

	public static void main(String[] args) {
		
		Set<StringBuffer> set = new TreeSet<>(new StringComparator());
		
		set.add(new StringBuffer("abcfdsfsfsfsf"));
		set.add(new StringBuffer("defdddddd"));
		set.add(new StringBuffer("xyzfffffffffffffffff"));
		set.add(new StringBuffer("xyz"));
		
		for (StringBuffer string : set) {
			System.out.println(string);
		}
		
	}

}
