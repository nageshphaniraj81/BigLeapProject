package MapInterface;

public class User {
	
	@Override
	public String toString(){
		return "user";
	}
	
	@Override
	public void finalize(){
		System.out.println("finalize method called");
	}

}
