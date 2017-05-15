package Basics;

public class ThreadIdentity extends Thread{

	public static void main(String[] args)throws InterruptedException {
		
		ThreadIdentity jd = new ThreadIdentity();
		jd.start();
		
		// To get thread identity
		Thread t = Thread.currentThread();
		
		// To set the name of the thread
		System.out.println("Name of the current thread is "+t.getName());

	}

	@Override
	public void run() {
		
		// To get thread identity
		Thread t1 = Thread.currentThread();
		
		// To set the name of the thread
		System.out.println("Name of the child thread is "+t1.getName());
		
		// To set new thread identity
		t1.setName("Child thread");
		
		// To get thread identity
		System.out.println("Name of the child thread is "+t1.getName());

	}

}
