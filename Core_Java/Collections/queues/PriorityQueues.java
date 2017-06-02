package queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {

	public static void main(String[] args) {
		
		Queue<Persons> person = new PriorityQueue<>();
		person.add(new Persons("Nagesh",25));
		person.add(new Persons("Raghav",44));
		person.add(new Persons("Mahesh",10));
		person.add(new Persons("Kumar",70));
		
		while(person.peek()!=null){
			System.out.println(person.poll());
		}
		
		
	}

}
