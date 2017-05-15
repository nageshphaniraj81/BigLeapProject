package SetInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class IteratorDemo {

	public static void main(String[] args) {
		
	   System.out.println(" Iterator for List");
		ArrayList<Integer> list = new ArrayList();
		list.add(new Integer(20));
		list.add(40);
        list.add(50);
        
        Iterator<Integer> itr  = list.iterator();
        
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }
        
        System.out.println("Now Iterator for Set");
        
    	Set<Integer> set = new TreeSet();
    	set.add(new Integer(60));
    	set.add(70);
    	set.add(80);
        
        Iterator<Integer> setIterator  = set.iterator();
        
        while(setIterator.hasNext()){
        	System.out.println(setIterator.next());
        }
		
	}

}
