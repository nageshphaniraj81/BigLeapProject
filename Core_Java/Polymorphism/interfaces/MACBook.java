package interfaces;

public class MACBook implements AppleLaptop {

	@Override
	public void start() {
		System.out.println("Inside MACBook start method");
	}

	@Override
	public void shutdown() {
		System.out.println("Inside MACBook shutdown method");
	}
	
	

}
