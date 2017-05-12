package HierarcicalInheritance;

public class Car extends Vehicle {

	@Override
	String fuel(){
		return "Diesel";
	}
	
	public void superFuel(){
		System.out.println(super.fuel());
	}
}
