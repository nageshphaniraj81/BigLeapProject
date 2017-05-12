package wildcards;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcards {
	
	public static void show(List<? super Number> list){
		
	// For adding we have to use subclasses
		list.add(new Integer(4));
		list.add(new Float(6));
		
	// For reading we have to use objects (as it is safe)
		for (Object object : list) {
			System.out.println(object);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		List<Serializable> l = new ArrayList<>();
		l.add("nagesh");
		l.add("Anusha");
		l.add("chicken");
		LowerBoundedWildcards.show(l);
		
	}

}
