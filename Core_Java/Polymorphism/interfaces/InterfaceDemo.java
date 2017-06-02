package interfaces;

public class InterfaceDemo {

	public static void main(String[] args) {
		AppleLaptop macbookAir = new MACBookAir();
		macbookAir.start();
		macbookAir.shutdown();
		
		MACBookPro macbookPro = new MACBookPro();
		macbookPro.start();
		macbookPro.shutdown();
		
//		// Object casting
//		MACBookPro m2 = (MACBookPro)macbookPro;
//		m2.proMethod();

	}

}
