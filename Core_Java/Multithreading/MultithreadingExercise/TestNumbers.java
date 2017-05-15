package MultithreadingExercise;

public class TestNumbers {
	
    public static void main(String[] args) throws InterruptedException {
    	EvenNumberThread t1 = new EvenNumberThread();
    	OddnumberThread t2 = new OddnumberThread();
    	
    	t1.start();
    	
    	
    	synchronized (t1){
        System.out.println("Before wait method");
    	t1.wait();
    	System.out.println("Got the notification");
  	    t2.start(); 
    	}
	}
	

}
