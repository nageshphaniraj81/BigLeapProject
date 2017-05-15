package checkedexception;
import java.io.*;

public class DemoFileNotFoundException {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
