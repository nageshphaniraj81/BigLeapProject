package Basics;
public class ImplementingRunnableInterface implements Runnable {
	
	@Override
	public void run(){
		System.out.println("Inside run method");
	}

	public static void main(String[] args) {
		ImplementingRunnableInterface running = new ImplementingRunnableInterface();
		Thread t = new Thread(running);
		t.start();
	}

}
