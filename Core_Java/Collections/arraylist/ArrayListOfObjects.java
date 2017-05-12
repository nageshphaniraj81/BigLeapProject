package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOfObjects {

	public static void main(String[] args) {
		List<Computer> pc = new ArrayList<>(100);
		
		pc.add(new Computer(2,1000,"HP"));
		pc.add(new Computer(4,1000,"Dell"));
		pc.add(new Computer(2,500,"HP"));
		pc.add(new Computer(6,1000,"Linovo"));

		ArrayListOfObjects.displayList(pc);
		
		pc.remove(2);
		
		ArrayListOfObjects.displayList(pc);
		
		for(int i = 0;i<10000;i++){
			pc.add(new Computer(i++,i+1000,"HP"+i));
		}
		
		ArrayListOfObjects.displayList(pc);
		
	}
	
	public static void displayList(List<Computer> list){
		for (Computer computer : list) {
			System.out.println(computer.toString());
		}
		System.out.println();
	}

}
