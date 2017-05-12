package arraylist;

public class Computer {

	private int memory;
	private int space;
	private String model;
	
	public Computer(int memory, int space, String model) {
		super();
		this.memory = memory;
		this.space = space;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Computer [memory=" + memory + ", space=" + space + ", model=" + model + "]";
	}
	
}
