package InterThreadCommunication;

public class childThread extends Thread{
	
	int sum;
	
	public void run(){
		synchronized(this){
		for (int i=0;i<=100;i++){
			sum+=i;
		}
		this.notify();
		}
	}
}
