package staticmembers;

public class CallingStaticVariablesFromDifferentClass {
	public static void main(String[] args) {
		
		// calling static variable from different class
		StaticVariables.num = 100;
		System.out.println(StaticVariables.num);
		
		// calling static variable from different class
		StaticVariables.num = 200;
		System.out.println(StaticVariables.num);
		
		// calling static final variable from different class
		System.out.println(StaticVariables.myConst);

	}
}
