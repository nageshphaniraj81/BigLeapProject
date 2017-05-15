package ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		Object objects [] = new Object[1000000];
		
		for (int i = 0; i < objects.length; i++) {
			objects[i] = new Object();
		}
		
		List<Object> list = new ArrayList<>();
		
		long start = System.currentTimeMillis();
		for (Object object : objects) {
			list.add(object);
		}	
		long end = System.currentTimeMillis();
		
		System.out.println("Tametaken for Arraylist : "+(end-start));
		
		
		List<Object> list2 = new LinkedList<>();
		start = System.currentTimeMillis();
		for (Object object : objects) {
			list2.add(object);
		}	
		 end = System.currentTimeMillis();
		
		System.out.println("Tametaken  for linkedlist : "+(end-start));
	}

}
