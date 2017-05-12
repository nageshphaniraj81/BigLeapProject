package queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> myQueue = new LinkedList<>();
		myQueue.add("nagesh");
		myQueue.add("pagesh");
		myQueue.add("sogesh");
		
		for (String string : myQueue) {
			System.out.println(string);
		}
		
		System.out.println("First element in the queue is : "+myQueue.element());
		
		int size = myQueue.size()-1;
		System.out.println(size);
		
		for (int i = 0; i <= size; i++) {
			System.out.println(myQueue.remove());
		}
		
	}

}
