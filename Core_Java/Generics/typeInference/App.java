package typeInference;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	
	public static <T> void addStore(T t,List<Bucket<T>> list){	
		Bucket<T> bucket = new Bucket<>();
		bucket.setItem(t);
		list.add(bucket);
		System.out.println("Item "+bucket.getItem().toString()+" has been added to the list");
	}
	

	public static void main(String[] args) {
		List<Bucket<String>> mylist = new ArrayList<>();
		App.addStore("Nagesh", mylist);
		System.out.println(mylist.get(0).getItem().toString());	
	}

}

class Bucket<T>{
	
	private T item;
	
	public T getItem(){
		return this.item;
	}
	
	public void setItem(T item){
		this.item = item;
	}	
}
