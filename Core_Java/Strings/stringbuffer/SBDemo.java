package stringbuffer;

public class SBDemo {

	public static void main(String[] args) {
		
	   // String buffer has various useful methods that can be used to modify the strings
	   // Such as .capacity,.appeand,.reverse,.insert,.delete
		
       StringBuffer sb = new StringBuffer();
       System.out.println("Initial capacity : "+sb.capacity());
       sb.append("Nagesh is a good boy ");
       sb.append("World is not enough");
       System.out.println("Current capacity : "+sb.capacity());
       System.out.println(sb.toString());
       System.out.println(sb.reverse());
       System.out.println(sb.reverse());
       System.out.println(sb.insert(3, "xxxxxxxxx"));
       System.out.println(sb.delete(3, sb.length()));
	}

}
