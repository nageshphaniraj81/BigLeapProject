package EnumBasics;

public enum PaymentTypes {
    CREDITCARD(0),DEBITCARD(10),CASH(15);
	
	int fees;
	
	PaymentTypes(int fees){
		this.fees = fees;
	}
	
	public int returnFees(){
		return this.fees;
	}
}
