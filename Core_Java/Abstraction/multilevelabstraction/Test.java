package multilevelabstraction;



public class Test {

	public static void main(String[] args) {
		
		TouchScreenLaptop hp = new HPNotebook();
		hp.scroll();
		hp.click();
        TouchScreenLaptop dell = new DellNotebook();
        dell.scroll();
        dell.click();
	}

}
