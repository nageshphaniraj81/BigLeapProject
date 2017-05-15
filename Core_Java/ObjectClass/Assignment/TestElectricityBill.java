package Assignment;

public class TestElectricityBill {

	public static void main(String[] args) {
            ElectricityBill eb = new ElectricityBill();
            eb.setMeterNo(1234);
            eb.setName("nagesh");
            eb.setAddress("address 1");
            
            ElectricityBill eb2 = new ElectricityBill();
            eb2.setMeterNo(1234);
            eb2.setName("nagesh");
            eb2.setAddress("address 1");
            
            System.out.println(eb.toString());
            System.out.println(eb.hashCode());
            System.out.println(eb.equals(eb2));


	}

}
