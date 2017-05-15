package Basics;
public class YealdMethodDemo extends Thread {

	public void run() {
		
		for(int i=1;i<=15;i++){
			System.out.println("Child Thread :"+i);
			Thread.yield();
			
		}
	}

	

}
