package Basics;
public class YealdMethodTest {

public static void main(String[] args) {
		
		YealdMethodDemo d = new YealdMethodDemo();
		d.start();
	
		for(int i=1;i<=15;i++){
			System.out.println("Parent Thread :"+i);
		}
	}

}
