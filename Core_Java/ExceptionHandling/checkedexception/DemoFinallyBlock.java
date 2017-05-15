package checkedexception;

import java.util.Scanner;

public class DemoFinallyBlock {

	  public static void main(String[] args) {
		  int a,b,c;
			
			try{
			System.out.println("Enter 2 numbers : ");
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			c = a/b;
			System.out.println("Result :"+c);
			}catch(ArithmeticException e){
				System.out.println("Please do not enter 0");
			}finally{
				// Finally block is executed irrespective of weither there is an exception or not
				// It is executed always
				// You can have Finally even though there is no catch statement
				System.out.println("Finally is called always");
				
			}
			System.out.println("Code after division");
			
		}
			
}
