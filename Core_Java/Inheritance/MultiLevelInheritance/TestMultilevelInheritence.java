package MultiLevelInheritance;

public class TestMultilevelInheritence {

	public static void main(String[] args) {

		Child child  = new Child();
		child.m1();
		child.m2();
		System.out.println(child.hashCode());
	}

}
