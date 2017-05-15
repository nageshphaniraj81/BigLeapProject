package Basics;
public class SingleThreadedApplication {

	public static void main(String[] args) {

		SingleThreadedApplication s = new SingleThreadedApplication();
		s.displayNumbers();
		
		for (int j=0;j<=200;j++){
			System.out.print("j :"+j+"\t");
		}

	}
	
	void displayNumbers(){
		
		for (int i=0;i<=200;i++){
			System.out.print("i :"+i+"\t");
		}
		
	}

}
