package generics;

class Stores<T>{
	
	private T item;
	
	public void setStoreItem(T item){
		this.item = item;
	}
	
	public T getItem(){
		return item;
	}
	
	@Override
	public String toString(){
		return ""+this.item.toString();
		
	}
	
}

class HashTable<K,V>{
	
	private K key;
	private V value;
	
	HashTable(K key,V value){
		this.key = key;
		this.value = value;
	}
	
	@Override
	public String toString(){
		return this.key.toString()+" "+this.value.toString();
	}
	
	
}

public class UsingGenerics {

	public static void main(String[] args) {
//		//raw type avoid it
//	      Stores store = new Stores();
//	      store.setStoreItem(45.6);
//	      System.out.println(store.toString());
		
		 // Use diamond operator to use generic
	      Stores<String> store = new Stores<>();
	      store.setStoreItem("Hello");
	      System.out.println(store.toString());
	      
	      HashTable<String,Integer> hashtable = new HashTable<String,Integer>("Hello",5);
	      System.out.println(hashtable.toString());
	      
	      HashTable<String,String> hashtable2 = new HashTable<String,String>("Hello","Nagesh");
	      System.out.println(hashtable2.toString());
	}

}
