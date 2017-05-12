package queues;

import java.util.ArrayDeque;
import java.util.Deque;

// These are doubly ended queue where we can insert and remove from both ends of the queue

public class DequeueDemo {
	
	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		deque.offerFirst(10);
		deque.offerLast(20);
		deque.offerFirst(30);
		deque.offerLast(40);
		

		
		for (Integer integer : deque) {
			System.out.println(integer);
		}
		
		deque.removeLast();
		System.out.println();
		
		for (Integer integer : deque) {
			System.out.println(integer);
		}
		
		deque.removeFirst();
		System.out.println();
		
		for (Integer integer : deque) {
			System.out.println(integer);
		}
		
	}



	
}
