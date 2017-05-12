package ConstructorChaining;

public class SuperClass {
	int x;
	
	SuperClass(){
		System.out.println("No arg Super Constructor");
	}
	
	SuperClass(int x){
		this();
		this.x = x;
		System.out.println("One Arg super constructor - Arg : "+x);
	}

}
