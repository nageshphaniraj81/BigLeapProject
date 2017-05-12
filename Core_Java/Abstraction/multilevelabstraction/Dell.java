package multilevelabstraction;

public abstract class Dell implements TouchScreenLaptop{

	@Override
	public void scroll() {
		System.out.println("Scroll method in Dell");
	}
	

}
