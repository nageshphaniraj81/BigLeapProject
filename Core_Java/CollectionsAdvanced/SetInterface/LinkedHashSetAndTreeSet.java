package SetInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetAndTreeSet {

	public static void main(String[] args) {

		Random obj = new Random();
		Set<Integer> hashSet =new HashSet<>();
		Set<Integer> linkedHashset ;
		Set<Integer> treeSet ;
		
        System.out.print("OriginalOrder : ");
		for(int i=0;i<=5;i++){
			int number = obj.nextInt(100);
			System.out.print(number+",");
			hashSet.add(number);
		}
		
		System.out.println();
		System.out.println("Set is "+hashSet);
		
		linkedHashset =new LinkedHashSet<>(hashSet);
		System.out.println("Linked HashSet is "+linkedHashset);
		
		treeSet =new TreeSet<>(hashSet);
		System.out.println("Tree Set is "+treeSet);
		
	}

}
