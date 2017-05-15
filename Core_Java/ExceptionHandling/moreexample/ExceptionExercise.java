package moreexample;

public class ExceptionExercise {

	public static void main(String[] args) {

		try {
			Thread.sleep(2000);
			System.out.println("Inside try block");
		} catch (InterruptedException e) {
			System.out.println("Inside catch block");
			// TODO Auto-generated catch block
			throw new MyThreadException("This is my custom exception");
		}

	}

}
