package Navigable;

import java.util.TreeSet;

public class NavigableTreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> s  = new TreeSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		
		System.out.println(s);
		
		System.out.println(s.ceiling(30));
		System.out.println(s.higher(30));
		System.out.println(s.floor(30));
		System.out.println(s.lower(30));
		System.out.println(s.descendingSet());
		System.out.println(s.pollFirst());
		System.out.println(s.pollLast());
		System.out.println(s);
		
		
	}

}
