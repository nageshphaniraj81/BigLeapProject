package staticmembers;

public class StaticBlocks {

	public static void main(String[] args) {

		// To print Hello world
		System.out.println("Hello World in Main method");

	}

	// This block is loaded even before main method
	static {
		System.out.println("Static block 1");
	}

	// Static block 2 (Order of static block is important
	static {
		System.out.println("Static block 2");
	}
	
	//This block is loaded after block 2
	static {
		System.out.println("Static block 3");
	}
	
	// This block is loaded after block 3
	static {
		System.out.println("Static block 4");
	}

}
