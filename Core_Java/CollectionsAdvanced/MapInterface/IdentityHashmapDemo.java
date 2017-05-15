package MapInterface;

import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class IdentityHashmapDemo {

	public static void main(String[] args) {
		
		// Identity hasmp does not overwrite when the ID is same,
		//it does the == comparison and not equals comparison
		Map<Integer,String> map = new IdentityHashMap<>();
		
		Integer id1 = new Integer(10);
		Integer id2 = new Integer(10);
		
        map.put(id1, "nagesh");
        map.put(id2, "santosh");
        
        System.out.println(map);

		
	
	}

}
