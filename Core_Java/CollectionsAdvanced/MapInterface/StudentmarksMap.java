package MapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentmarksMap {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		
		map.put("nagesh", 100);
		map.put("santosh", 98);
		map.put("raj", 75);
		map.put("kiran", 80);
		
		// Display only keys
		Set<String> keySet = map.keySet();
		System.out.println("Keys are : "+keySet);
		
		// To display only values
		Collection<Integer> values = map.values();
		System.out.println("Values are : "+values);
		
		for (String key : keySet) {
			System.out.println("Key : "+key+"| Value : "+map.get(key));
		}
	}

}
