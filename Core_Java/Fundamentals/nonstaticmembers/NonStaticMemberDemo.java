package nonstaticmembers;

public class NonStaticMemberDemo {

	int num;

	NonStaticMemberDemo() {
		this.num = 100;
		System.out.println("Inside constructor");
	}
	
	public void iceCream(){
		System.out.println("Type ice cream");
	}
	
	{
		System.out.println("Inside non static block");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Inside the main method");
		new NonStaticMemberDemo();
		new NonStaticMemberDemo();
		new NonStaticMemberDemo();
		
		new NonStaticMemberDemo().iceCream();
	}
	
	static{
		System.out.println("Inside static block");
	}
}
