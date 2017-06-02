package interfaces;

public class MACBookPro extends MACBook {
	@Override
	public void start() {
		super.start();
		System.out.println("Inside MACBookPro start method");
	}

	@Override
	public void shutdown() {
		System.out.println("Inside MACBookPro shutdown method");
	}
	
	// Method to demo object casting
	public void proMethod(){
		System.out.println("Inside Pro method");
	}
}
