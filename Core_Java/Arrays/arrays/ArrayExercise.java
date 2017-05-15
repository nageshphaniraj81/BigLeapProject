package arrays;

public class ArrayExercise {

	public static void main(String[] args) {
        int [] values = {10,20,30,40,50};
        int [] reverse = reverseArray(values);
        
        for (int i : reverse) {
			System.out.print(i+"\t");
		}
	}
	
	public static int[] reverseArray(int[] array){
		int [] reverse = new int[array.length];
		int j =0;
		for (int i = array.length-1; i >= 0; i--) {
			reverse[j] = array[i];
			j++;
		}
		return reverse;
	}

}
