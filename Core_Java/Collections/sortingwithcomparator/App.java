package sortingwithcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Book> books =  new ArrayList<>();
		books.add(new Book("Book1",989));
		books.add(new Book("Book4",34));
		books.add(new Book("Book5",455));
		books.add(new Book("Book2",433));
		
		Collections.sort(books,new BookComparatorByNames());
		
		System.out.println(books);
	}

}
