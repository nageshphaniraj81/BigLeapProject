package objectreference;

public class Demo {
	
	// Declaring a static variable of type object
	static Demo obj;
	
	static{
		
		// At this time the memore is not allocated to the object &
		// hence the reference will be null
		System.out.println(Demo.obj);
		
		// Now the memory is allocated for the object
		Demo.obj = new Demo();
	}
	
	public static void main(String[] args) {
		
		// It shows the memory reference
		System.out.println(Demo.obj);
	}

}
