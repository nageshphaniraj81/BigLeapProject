package uncheckedexception;
import java.util.Scanner;

public class ExceptionHierarchyDemo {
public static void main(String[] args) {
	int a,b,c;
	
	try{
	System.out.println("Enter 2 numbers : ");
	Scanner sc = new Scanner(System.in);
	a = sc.nextInt();
	b = sc.nextInt();
	c = a/b;
	System.out.println("Result :"+c);
	
	 // Using runtime exception instead of specific exception
	}catch(RuntimeException e){ 
		System.out.println("Please do not enter 0");
	}
	System.out.println("Code after division");
	

}
}
