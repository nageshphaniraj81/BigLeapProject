package ObjectCompareUsingComparable;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeSort {

	public static void main(String[] args) {
		Set<Employee> employee = new TreeSet<>();
		employee.add(new Employee(100,"nagesh"));
		employee.add(new Employee(400,"anusha"));
		employee.add(new Employee(200,"santosh"));
		employee.add(new Employee(50,"kumar"));
		employee.add(new Employee(630,"shalini"));
		
		for (Employee employee2 : employee) {
			System.out.println("Employee ID : "+employee2.id);
			System.out.println("Employee Name : "+employee2.name);
		}
		
	}

}
