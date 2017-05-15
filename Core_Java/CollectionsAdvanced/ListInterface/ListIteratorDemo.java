package ListInterface;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		
		list.add("abc");
		list.add("xyz");
		list.add("def");
		
		System.out.println("To traverse forward a linked list using ListIterator :");
		
		ListIterator <String> litr = list.listIterator();
		
		while(litr.hasNext()){
			System.out.println(litr.next());
		}
		
		System.out.println("To traverse reverse a linked list using ListIterator :");
		
		while(litr.hasPrevious()){
			System.out.println(litr.previous());
		}
		
	}

}
