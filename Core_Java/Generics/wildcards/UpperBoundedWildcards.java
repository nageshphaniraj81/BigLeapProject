package wildcards;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcards {
	
	// Since ? extends Number is a UPPER bounded wildcards,
	// we do not know if it is a Integer or Double, we can only perform 
	// iteration on the Super class Numbers and we cannot add items to the list
	// as we do not know in the method that if it is Integer or double...
	
	
	public static void sumNumbers(List<? extends Number> list){
		
		double sum = 0.0;
		for (Number number : list) {
			sum = sum+number.doubleValue();
		}
		System.out.println("Sum of the numbers is : "+ sum);
	}

	public static void main(String[] args) {
		UpperBoundedWildcards.sumNumbers(Arrays.asList(1,2,3,4,5,7));
	}

}
