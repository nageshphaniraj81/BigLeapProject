package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingInCollection {

	//Java uses quicksort -> for primitive types
	// Mergesort -> for reference type
	
	public static void main(String[] args) {
		int [] n = {45,-2,6,88,89,909};
		Arrays.sort(n);
		for (int i : n) {
			System.out.println(i);
		}
		
		String [] names = {"nagesh","test","Adam","Kuru","Bharath"};
		Arrays.sort(names);
		for (String i : names) {
			System.out.println(i);
		}
		
		List<String> cities = new ArrayList<>();
		cities.add("Bangalore");
		cities.add("Mysore");
		cities.add("Allahabad");
		cities.add("Cochin");
		
		// We use java.util.collection for sorting collection classes
		Collections.sort(cities);
		
		for (String string : cities) {
			System.out.println(string);
		}
		
	}

}
