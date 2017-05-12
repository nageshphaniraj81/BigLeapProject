package set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// O(log(n))
public class TreeHashSetDemo {
public static void main(String[] args) {
	Set<Integer> newSet = new TreeSet<>();
	newSet.add(55);
	newSet.add(34);
	newSet.add(54);
	newSet.add(6);
	newSet.add(555);
	newSet.add(66);
	newSet.add(89);
	newSet.add(4);
	newSet.add(545);
	
	System.out.println(newSet.contains(66));
	System.out.println();
	
	newSet.remove(999);
	
	for (Integer number : newSet) {
		System.out.println(number);
	}
}
}

