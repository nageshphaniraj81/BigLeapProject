package genericmethodsdeom;

public class GenericMethod {
	
	public <T> void returnArray(T[] array){
		for (T t : array) {
			System.out.print(t.toString()+" -> ");
		}
	}
	
	public <T> T returnStore(T t){
		System.out.println("Value of the item is : "+t.toString());
		return t;
	}

}
