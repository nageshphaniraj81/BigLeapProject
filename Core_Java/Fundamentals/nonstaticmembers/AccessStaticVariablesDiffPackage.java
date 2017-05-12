package nonstaticmembers;

public class AccessStaticVariablesDiffPackage {

	public static void main(String[] args) {

		// Access static members from different package in main method
		staticmembers.StaticVariables.num = 500;
		System.out.println(staticmembers.StaticVariables.num);

		// Access static method from different package in main method
		staticmembers.StaticVariables.hello();

	}

	static {

		// Access static members from different package in static block
		staticmembers.StaticVariables.num = 600;
		System.out.println(staticmembers.StaticVariables.num);

	}

}
