package Basics;
import java.util.Scanner;

public class JoinMethodDemonstration extends Thread {

	static int n, sum = 0;

	public static void main(String[] args) {
		System.out.println("Please enter a number");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		JoinMethodDemonstration.n = sc.nextInt();
		JoinMethodDemonstration jd = new JoinMethodDemonstration();
		jd.start();
		try {
			// Join method ensures that the thread that is called joins before calling thread continue
			jd.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Sum of " + JoinMethodDemonstration.n + " numbers is :" + JoinMethodDemonstration.sum);
	}

	@Override
	public void run() {

		for (int i = 1; i <= JoinMethodDemonstration.n; i++) {
			JoinMethodDemonstration.sum += i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
