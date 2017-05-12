package generics;

class Store{
	
	private Object item;
	
	public void setStoreItem(Object item){
		this.item = item;
	}
	
	public Object getItem(){
		return item;
	}
	
	@Override
	public String toString(){
		return ""+this.item.toString();
		
	}
	
}

public class UsingObjectClass {
	public static void main(String[] args) {
      Store store = new Store();
      store.setStoreItem(45.6);
      System.out.println(store.toString());
	}

}
