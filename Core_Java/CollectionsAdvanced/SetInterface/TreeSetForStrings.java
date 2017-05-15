package SetInterface;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetForStrings {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>();
		set.add("xyz");
		set.add("abc");
		set.add("pqr");
		set.add("def");
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
