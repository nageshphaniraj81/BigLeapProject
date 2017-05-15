package uncheckedexception;

public class DemoStringParserException {

	public static void main(String[] args) {
       String s = "a";
       try{
       int i = Integer.parseInt(s);
       System.out.println(i);
       }catch(NumberFormatException e){
    	   // String "a" cannot be parsed int an integer
    	   System.out.println(e.toString());
       }
       System.out.println("Code after exception");
	}

}
