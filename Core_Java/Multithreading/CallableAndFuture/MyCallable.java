package CallableAndFuture;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

	int num;
	
	MyCallable(int num){
		this.num = num;
	}
	
	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName()+"is calculating all the numbers upto"+num);
		int sum =0;
				for(int i=1;i<=num;i++){
					sum+=i;
				}
		return sum;
	}

}
