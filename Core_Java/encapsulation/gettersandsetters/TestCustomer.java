package gettersandsetters;

public class TestCustomer {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setFirstName("Nagesh");
		c.setLastName("Phaniraj");
		c.setCreditCard("123334");
		
		System.out.println("First name :"+c.getFirstName());
		System.out.println("Last Name :"+c.getLastName());
		System.out.println("Creditcard :"+c.getCreditCard());
	}

}
