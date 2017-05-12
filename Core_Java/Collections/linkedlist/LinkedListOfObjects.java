package linkedlist;

import java.util.List;
import java.util.Vector;

public class LinkedListOfObjects {

	public static void main(String[] args) {
		List<Computer> pc = new Vector<>(100,300);
		
		pc.add(new Computer(2,1000,"HP"));
		pc.add(new Computer(4,1000,"Dell"));
		pc.add(new Computer(2,500,"HP"));
		pc.add(new Computer(6,1000,"Linovo"));
		
		

		LinkedListOfObjects.displayList(pc);
		
		pc.remove(2);
		
		LinkedListOfObjects.displayList(pc);
		
		for(int i = 0;i<10000;i++){
			pc.add(new Computer(i++,i+1000,"HP"+i));
		}
		
		pc.clear();
		
		LinkedListOfObjects.displayList(pc);
		
	}
	
	public static void displayList(List<Computer> list){
		for (Computer computer : list) {
			System.out.println(computer.toString());
		}
		System.out.println();
	}

}
