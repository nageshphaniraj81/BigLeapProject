package InterruptThread;

public class MainThread {

	public static void main(String[] args) {

      ChildThread c = new ChildThread();
      c.start();
      c.interrupt();
      System.out.println("End of main method");

	}

}
