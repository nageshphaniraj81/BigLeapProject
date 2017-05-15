package ClassLevelLock;

public class SynchronizedDemo {

	public static void main(String[] args) {
	
      MyThread t1 = new MyThread("nagesh");
      MyThread t2 = new MyThread("santosh");
      MyThread t3 = new MyThread("anusha");
      
      t1.start();
      t2.start();
      t3.start();

	}

}
