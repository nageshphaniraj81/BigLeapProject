package BoundedTypeParameters;

public class App {
	
	public static <T extends Comparable<T>> T calculateMinimum(T i,T j){
		if(i.compareTo(j)<0)
			return i;
		return j;
	}

	public static void main(String[] args) {
		System.out.println(calculateMinimum("Amar","Raja").toString());
	}

}
