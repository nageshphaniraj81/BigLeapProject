package uncheckedexception;

public class DemoMultiCatch {

	public static void main(String[] args) {
	
		try{
		String input = args[0];
		System.out.println("Input is "+input);
		
		int output = Integer.parseInt(input);
		System.out.println("Output is "+output);
		
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Please enter a value");
		}catch(NumberFormatException e){
			System.out.println("Please enter a valid value");
			e.printStackTrace();
		}
		System.out.println("More code can go here");

	}

}
