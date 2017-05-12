package queues;

public class Persons implements Comparable<Persons>{

	private int age;
	private String name;

	public Persons() {

	}

	public Persons(String name,int age) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name : " + this.name + " | Age : " + this.age;
	}

	@Override
	public int compareTo(Persons anotherPerson) {	
		//return Integer.compare(this.age, anotherPerson.getAge());
		return this.name.compareTo(anotherPerson.getName());
	}
		


}
