package OverrideEqualsMethod;

public class TestPassanger {

	public static void main(String[] args) {
	       Passanger passanger = new Passanger();
	       passanger.setFirstName("Nagesh");
	       passanger.setLastName("Phaniraj");
	       passanger.setId(123);
	       
	       Passanger passanger2 = new Passanger();
	       passanger2.setFirstName("Nagesh");
	       passanger2.setLastName("Phaniraj");
	       passanger2.setId(123);
	       
	       System.out.println(passanger.equals(passanger2));
	       System.out.println(passanger.hashCode());
	       System.out.println(passanger2.hashCode());
	}

}
