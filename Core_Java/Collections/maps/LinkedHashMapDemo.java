package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		Map<String,String> linkedhashmap = new LinkedHashMap<>();
		linkedhashmap.put("nagesh", "nagesh@gmail.com");
		linkedhashmap.put("anusha", "anusha@gmail.com");
		linkedhashmap.put("santosh", "santosh@gmail.com");
		linkedhashmap.put("anil", "anil@gmail.com");
		
		Set<String> keySet = linkedhashmap.keySet();
		for (String string : keySet) {
			System.out.println(linkedhashmap.get(string));
		}
		System.out.println("Added Order is maintained");
	}
	}


