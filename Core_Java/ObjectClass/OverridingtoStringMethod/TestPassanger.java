package OverridingtoStringMethod;

public class TestPassanger {

	public static void main(String[] args) {
       Passanger passanger = new Passanger();
       passanger.setFirstName("Nagesh");
       passanger.setLastName("Phaniraj");
       System.out.println(passanger);
       System.out.println(passanger.hashCode());
	}

}
