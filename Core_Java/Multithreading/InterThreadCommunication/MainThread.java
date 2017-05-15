package InterThreadCommunication;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {

      childThread c = new childThread();
      c.start();
      
      synchronized(c){
    	  System.out.println("Before wait method");
    	  c.wait();
    	  System.out.println("Got the notification");
    	  System.out.println("Sum is :"+c.sum); 
      }
      

	}

}

