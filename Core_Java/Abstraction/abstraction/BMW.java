package abstraction;

public abstract class BMW {

	 void commonFunc(){
		 System.out.println("Inside common func method");
	 }
	 
	 abstract void accelerate();
	 
	 public static void main(String[] args) {
		System.out.println("Inside main method");
	}

}
