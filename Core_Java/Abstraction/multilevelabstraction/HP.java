package multilevelabstraction;

public abstract class HP implements TouchScreenLaptop {

	@Override
	public void scroll() {
          System.out.println("Scroll method in HP");
	}
	
}
