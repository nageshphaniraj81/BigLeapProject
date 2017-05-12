package SuperMethod;

public class Child extends Parent{
	
	int c;
	int d;
	
	 Child (int a,int b,int c,int d){
		 super(a,b);
		 this.c =c;
		 this.d= d;
	 }
	 
	 public void displayValues(){
		 System.out.println("Value of  a:"+super.a);
		 System.out.println("Value of  b:"+super.b);
		 System.out.println("Value of  c:"+this.c);
		 System.out.println("Value of  d:"+this.d);
	 }

}
