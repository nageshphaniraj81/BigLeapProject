package SingleInheritance;

public class SingleInheritance {

	public void m1(){
		System.out.println("Inside method m1");
	}
	
	public static void main(String[] args) {
		SingleInheritance si = new SingleInheritance();
		si.m1();
		
		// Displays hashcode of the object
		si.hashCode();
		
		// Display the class to which the object belong
		si.getClass();
		
		System.out.println(si.hashCode());
		System.out.println(si.getClass());
	}
	
}
