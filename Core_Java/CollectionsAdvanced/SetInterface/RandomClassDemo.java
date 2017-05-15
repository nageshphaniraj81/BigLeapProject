package SetInterface;

import java.util.Random;

public class RandomClassDemo {

	public static void main(String[] args) {
		Random obj = new Random();
		
		int i = obj.nextInt();
		System.out.println("i : "+i);
		
		int j = obj.nextInt(100);
		System.out.println("j with bound : "+j);
	}

}
