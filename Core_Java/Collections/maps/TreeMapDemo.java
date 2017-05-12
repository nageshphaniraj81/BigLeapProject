package maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<String,String> linkedhashmap = new TreeMap<>();
		linkedhashmap.put("nagesh", "nagesh@gmail.com");
		linkedhashmap.put("anusha", "anusha@gmail.com");
		linkedhashmap.put("santosh", "santosh@gmail.com");
		linkedhashmap.put("anil", "anil@gmail.com");
		
		Set<String> keySet = linkedhashmap.keySet();
		for (String string : keySet) {
			System.out.println(linkedhashmap.get(string));
		}
		System.out.println("Added Order is maintained");
		
		for (Map.Entry<String, String> entry : linkedhashmap.entrySet()) {
			System.out.println("Key is :"+entry.getKey()+" Value is : "+entry.getValue());
		}
	}
	}


