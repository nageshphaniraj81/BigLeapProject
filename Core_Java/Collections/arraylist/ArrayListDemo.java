package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(500);
		list.add("cathe");
		list.add("Kumar");
		list.add("Bahubali");

		ArrayListDemo.displayList(list);

		list.remove(1);

		ArrayListDemo.displayList(list);

		System.out.println(list.isEmpty());

		System.out.println(list.get(0));

		Object[] obj = list.toArray();

		for (Object eachObject : obj) {
			System.out.println(eachObject);
		}

		for (int i = 0; i < 450; i++) {
			list.add("Number" + i);
		}

		ArrayListDemo.displayList(list);

		Iterator<String> i = list.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println(list.hashCode());

	}

	public static void displayList(List<String> list) {

		for (String names : list) {
			System.out.println(names);
		}
		System.out.println();
	}

}
