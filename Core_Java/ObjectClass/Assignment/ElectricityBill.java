package Assignment;

public class ElectricityBill {

	int meterNo;
	String name;
	String address;
	public int getMeterNo() {
		return meterNo;
	}
	public void setMeterNo(int meterNo) {
		this.meterNo = meterNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
      return "Meter number is :"+this.meterNo+" Name is : "+this.name+" Address is : "+this.address;
	}
	
	@Override
	public boolean equals(Object obj) {
       ElectricityBill ebill = (ElectricityBill)obj;
       
       if(ebill.getMeterNo()==this.meterNo){
    	   return true;
       }else{
    	   return false;
       }
	}
	
	@Override
	public int hashCode() {
        return this.meterNo+this.name.length();
	}
	
	
}
