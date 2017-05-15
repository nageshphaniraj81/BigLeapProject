package AnonymousInnerClass;

public class AnonymousRunnable {

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("Run method of anonymus inner class");
			}
		});
		
		t.start();

	}

}
