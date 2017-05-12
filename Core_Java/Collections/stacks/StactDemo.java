package stacks;

import java.util.Stack;

public class StactDemo {

	public static void main(String[] args) {
		
		// Stack is a last in first out data structure
		
		Stack<Integer> myStack =  new Stack<>();
		
		// Test push method
		myStack.push(40);
		myStack.push(50);
		myStack.push(60);
		myStack.push(70);
		
		for (Integer integer : myStack) {
			System.out.println(integer);
		}
		
		// Test size method
		int max = myStack.size()-1;
		System.out.println("Stack size is "+max);
		
	    // test pop method
		for(int i=0;i<= max-1;i++){
			System.out.println(myStack.pop());
		}
		
		//Test peack method
		System.out.println("Peek of the stack is : "+myStack.peek());
	}
	
	
}
