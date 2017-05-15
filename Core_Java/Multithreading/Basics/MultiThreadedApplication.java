package Basics;
public class MultiThreadedApplication extends Thread{

	public static void main(String[] args) {

		MultiThreadedApplication m = new MultiThreadedApplication();
		m.start();
		for (int j=0;j<=200;j++){
			System.out.print("j :"+j+"\t");
		}
	}

	@Override
	public void run() {
		for (int i=0;i<=200;i++){
			System.out.print("i :"+i+"\t");
		}
		
	}
	
	

}
