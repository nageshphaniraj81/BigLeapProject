package ListInterface;

import java.util.ArrayList;

public class RestrictingArraylistType {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(new Integer(20));
		a.add(40);
		a.add(50);
		a.add(5);
	}

}
