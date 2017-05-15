package SetInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HashsetDemo {

	public static void main(String[] args) {

		Random obj = new Random();
		List<Integer> list = new ArrayList();
        
		for(int i=0;i<=10;i++){
			list.add(obj.nextInt(5));
		}
		
		System.out.println("List is "+list);
		
		Set<Integer> set =new HashSet<>(list);
		
		System.out.println("Set is "+set);
	}

}
