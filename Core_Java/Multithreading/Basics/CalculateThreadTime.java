package Basics;
import java.util.Scanner;

public class CalculateThreadTime extends Thread {

	static int n, sum = 0;

	public static void main(String[] args) {
		System.out.println("Please enter a number");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		JoinMethodDemonstration.n = sc.nextInt();
		JoinMethodDemonstration jd = new JoinMethodDemonstration();
		long start = System.currentTimeMillis();
		jd.start();
		try {
			jd.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		
		
		System.out.println("Sum of " + JoinMethodDemonstration.n + " numbers is :" + JoinMethodDemonstration.sum);
	    System.out.println("Time taken by thread is : "+(end - start)/1000+" Seconds");
	}

	@Override
	public void run() {

		for (int i = 1; i <= JoinMethodDemonstration.n; i++) {
			JoinMethodDemonstration.sum += i;
		}

	}


}
