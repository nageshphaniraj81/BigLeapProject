package objectcomparison;

public class User implements Comparable<User> {

	int id;
	String name;

	User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(User o) {
     return Integer.compare(this.getId(),o.getId());
	}

	@Override
	public boolean equals(Object obj) {
        obj = (User)obj;
		if( Integer.compare(this.getId(),((User) obj).getId())==0){
			return true;
		}else{
			return false;
		}
	}
	
    

}
