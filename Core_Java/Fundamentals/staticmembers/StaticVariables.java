package staticmembers;

public class StaticVariables {
	
	public static int num;
	public static final int myConst = 2500;
	static String name;
	
	// Static variables are called with Class names
	public static void main(String[] args) {
		
		// Default value is 0
		System.out.println(StaticVariables.num);
		// Default values for string is null
		System.out.println(StaticVariables.name);
		System.out.println(StaticVariables.num);
		StaticVariables.hello();
	}
	
	public static void hello(){
		System.out.println("Hello");
	}

}
