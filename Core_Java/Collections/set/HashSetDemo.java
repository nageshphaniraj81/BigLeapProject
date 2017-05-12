package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		//O(n)
		Set<String> newSet = new HashSet<>();
		newSet.add("cathe");
		newSet.add("Kumar");
		newSet.add("Bahubali");
		newSet.add("Amar");
		newSet.add("Jinda");
		newSet.add("sussi");
		newSet.add("Marma");
		newSet.add("sussi");
		newSet.add("Marma");
		
		System.out.println(newSet.contains("Bahubali"));
		System.out.println();
		
		for (String string : newSet) {
			System.out.println(string);
		}
	}

}
