package ClassLevelLock;

public class DisplayMessage {
	
	// Synchronized keyword is used
	
	public synchronized static void sayHello(String name){
		
		//Any code can go here
		System.out.println("Before synchronized block");
		
	{
		for(int i=1;i<=10;i++){
			System.out.println("Hello "+name);
		}
		}
	}
}
