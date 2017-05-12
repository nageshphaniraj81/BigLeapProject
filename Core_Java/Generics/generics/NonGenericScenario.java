package generics;

public class NonGenericScenario {
	
	public static void add(int i,int j){
		System.out.println("Sum of the number is "+(i+j));
	}
	
	public static void add(double i,double j){
		System.out.println("Sum of the number is "+(i+j));
	}

	public static void main(String[] args) {
		add(1,3);
		add(7.5,5.2);
	}

}
