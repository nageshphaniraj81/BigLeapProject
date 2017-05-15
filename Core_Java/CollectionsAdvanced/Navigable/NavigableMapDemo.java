package Navigable;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class NavigableMapDemo {

	public static void main(String[] args) {
		TreeMap<String,String> map = new TreeMap<>();
		
        map.put("a", "anusha");
        map.put("b", "bharath");
        map.put("d", "danush");
        map.put("h", "harish");
        map.put("n", "nagesh");
        map.put("y", "Yoni");
        
		System.out.println(map);

        System.out.println(map.floorKey("d"));
        System.out.println(map.ceilingKey("d"));
        System.out.println(map.higherKey("d"));
        System.out.println(map.lowerKey("d"));
        System.out.println(map.descendingMap());
        System.out.println(map.pollFirstEntry());
        System.out.println(map.pollLastEntry());
        System.out.println(map);

		
	}

}
