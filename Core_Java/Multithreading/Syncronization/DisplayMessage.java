package Syncronization;

public class DisplayMessage {
	
	// Synchronized keyword is used	
	public synchronized void sayHello(String name){
		for(int i=1;i<=10;i++){
			System.out.println("Hello "+name);
		}
	}
}
