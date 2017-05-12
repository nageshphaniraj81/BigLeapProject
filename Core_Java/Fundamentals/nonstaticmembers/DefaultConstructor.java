package nonstaticmembers;

public class DefaultConstructor {
	int num;
	
	// No constructor means, default constructor
	
	// Non static block
	{
		System.out.println("Inside non static block");
	}
	
	// Main method
	public static void main(String[] args) {
		System.out.println("Inside the main method");
		new DefaultConstructor();
		new DefaultConstructor();
		new DefaultConstructor();
	}
	
	// Static block
	static{
		System.out.println("Inside static block");
	}
}
