package ConstructorChaining;

public class ChildClass extends SuperClass {
	
	ChildClass(){
		this(30);
		System.out.println("No arg child class constructor");
	}
	
	ChildClass(int x){
		super(x);
		System.out.println("One Arg child class constructor - Arg : "+x);
	}

	public static void main(String[] args) {
      ChildClass c = new ChildClass();
	}

}
