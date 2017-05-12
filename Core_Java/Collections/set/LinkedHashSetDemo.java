package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	
	// O(n)
	public static void main(String[] args) {
		Set<String> newSet = new LinkedHashSet<>();
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
		
		newSet.remove("Bahubali");
		
		for (String string : newSet) {
			System.out.println(string);
		}
	}

	}

