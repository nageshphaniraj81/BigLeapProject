package sorting;

public class Books implements Comparable<Books> {

	private String name;
	private int numOfPages;

	public Books(String name, int numOfPages) {
		super();
		this.name = name;
		this.numOfPages = numOfPages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

	@Override
	public String toString() {
		return "Book name : " + this.name + " | Book pages :" + this.numOfPages;
	}

	@Override
	public int compareTo(Books arg0) {
		return Integer.compare(this.numOfPages, arg0.getNumOfPages());
	}

}
