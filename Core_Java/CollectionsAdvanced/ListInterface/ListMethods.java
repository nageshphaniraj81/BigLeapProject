package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		
		for(int i=10;i<=100;i+=10){
			list.add(i);
		}
		
		System.out.println("List is :"+list);
		
		list.add(2, 100);
		
		System.out.println("List after Insert is :"+list);
		
		list.set(3, 200);
		
		System.out.println("List after replacement is :"+list);
		
		//Iteration through the list
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+"\t");
		}
		
		list.remove(4);
		
		System.out.println();
		System.out.println("List after deletion is :"+list);
		
		// To add a list to the list
		List<Integer> secondList = new ArrayList();
		secondList.add(111);
		secondList.add(222);
		secondList.add(333);
		System.out.println("Second List is :"+secondList);
		
		list.addAll(4,secondList);
		
		System.out.println("List after adding second list is :"+list);
		
		// To search for the list element
		if(list.contains(222)){
			System.out.println("List contains the element");
		}else{
			System.out.println("List does not contain element");
		}
		
	}

}
