package checkedexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DemoThrowsKeyword {
	
	public void createFile() throws FileNotFoundException{
			FileInputStream fis = new FileInputStream("");
	}

	public static void main(String[] args) {
		DemoThrowsKeyword demo = new DemoThrowsKeyword();
		try {
			demo.createFile();
		} catch (FileNotFoundException e) {
			System.out.println("File should be available in the source location");
		}

	}

}
