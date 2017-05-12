package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingBookClass {
public static void main(String[] args) {
	
	List<Books> books =  new ArrayList<>();
	books.add(new Books("Book1",989));
	books.add(new Books("Book4",34));
	books.add(new Books("Book5",455));
	books.add(new Books("Book2",433));
	
	Collections.sort(books);
	
	System.out.println(books);
}
}
