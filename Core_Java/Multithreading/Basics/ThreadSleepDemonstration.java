package Basics;
public class ThreadSleepDemonstration extends Thread {

	public static void main(String[] args) throws InterruptedException {
		MultiThreadedApplication m = new MultiThreadedApplication();
		m.start();
		for (int j=0;j<=10;j++){
			System.out.print("j :"+j+"\t");
			Thread.sleep(1000);
		}
	}
	@Override
	public void run() {
		for (int i=0;i<=10;i++){
			System.out.print("i :"+i+"\t");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Child thread exited");
			}
		}
	}

}
