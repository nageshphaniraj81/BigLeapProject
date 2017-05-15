package arrays;

public class ArraysDemo {

	public static void main(String[] args) {
	  //Define array with values
      int [] a = {10,20,30,40,50};
      
      // Need to provide array size
      int arr[] = new int[4];
      arr[0] = 10;
      arr[1] = new Integer(20); // Autoboxing
      arr[2] = (int) 30.54;
      arr[3] = 40;
      
      try{
      arr[7] = 400;
      }catch(ArrayIndexOutOfBoundsException e){
    	  System.out.println("Array Index out of bound exception");
      }
      
      System.out.println("Elements of the array");
      for (int i : arr) {
		System.out.println(i);
	}
      
	}

}
