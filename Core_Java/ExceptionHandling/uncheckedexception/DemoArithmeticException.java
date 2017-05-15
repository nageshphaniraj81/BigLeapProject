package uncheckedexception;
import java.util.Scanner;

public class DemoArithmeticException {

	public static void main(String[] args) {
       
		int a,b,c;
		
		// Exception handling to handle arthematic (devide by zero) exception
		try{
		System.out.println("Enter 2 numbers : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = a/b;
		System.out.println("Result :"+c);
		}catch(ArithmeticException e){
			System.out.println("Please do not enter 0 for denominator");
		}
		System.out.println("Code after division");
		
	}

}
