package EnumBasics;

public class EnumTest {

	public static void main(String[] args) {
		PaymentTypes pt = PaymentTypes.DEBITCARD;
		System.out.println(pt);

		// Display all payment types enums
		PaymentTypes[] values = PaymentTypes.values();
		for (PaymentTypes paymentTypes : values) {
			System.out.println("Payment Type is : " + paymentTypes + " | Ordinal Value is : " + paymentTypes.ordinal()
					+ " | Transaction Fees is : " + paymentTypes.returnFees());
		}
	}

}
