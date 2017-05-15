package methodoverloading;

public class MethodoverloadingDemo {
	
	public void add(int a, int b){
		int result = a+b;
		System.out.println("Result is :"+result);
	}
	
	public void add(float a, float b){
		float result = a+b;
		System.out.println("Result is :"+result);
	}
	public void add(int a, int b, int c){
		int result = a+b+c;
		System.out.println("Result is :"+result);
	}
	
	public int add(int a, int b, int c, int d){
		int result = a+b+c+d;
		return result;
	}

	public static void main(String[] args) {
		MethodoverloadingDemo demo = new MethodoverloadingDemo();
		demo.add(10, 20);
		demo.add(30f, 40f);
		demo.add(40, 50,60);  
		System.out.println("result : "+demo.add(1,2,3,4));
	}

}
