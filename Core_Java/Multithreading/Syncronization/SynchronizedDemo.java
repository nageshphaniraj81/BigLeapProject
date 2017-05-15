package Syncronization;

public class SynchronizedDemo {

	public static void main(String[] args) {

      DisplayMessage dm = new DisplayMessage();
      MyThread t1 = new MyThread(dm,"nagesh");
      MyThread t2 = new MyThread(dm,"santosh");
      MyThread t3 = new MyThread(dm,"anusha");
      
      t1.start();
      t2.start();
      t3.start();

	}

}
