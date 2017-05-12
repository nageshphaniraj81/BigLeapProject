package MultiLevelInherSameMemory;

public class Child extends Parent {
	
	Child(){
		System.out.println("Child Object "+this);
	}

	public void m2(){
		System.out.println("Inside child method m2");
	}
}
