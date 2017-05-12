package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,String> users = new HashMap<>();
		users.put("nagesh", "nagesh@gmail.com");
		users.put("anusha", "anusha@gmail.com");
		users.put("santosh", "santosh@gmail.com");
		users.put("anil", "anil@gmail.com");
		
		Set<String> keySet = users.keySet();
		for (String string : keySet) {
			System.out.println(users.get(string));
		}
		System.out.println("No order is maintained");
	}

}
