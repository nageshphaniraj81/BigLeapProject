package CollectionsUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassDemo {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Z");
		l.add("A");
		l.add("R");
		l.add("A");
		
		System.out.println("Before Sort : "+l );
		Collections.sort(l,new MyComparator());
		System.out.println("Before Sort : "+l );
		
	}

}
