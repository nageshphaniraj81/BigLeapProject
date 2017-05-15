package MultithreadingExercise;

public class OddnumberThread extends Thread{
	
	public void run(){

		for(int i=1;i<=10;i++){
			if(i%2!=0){
				System.out.println("Odd Number : "+i);
			}
		}

	}

}
