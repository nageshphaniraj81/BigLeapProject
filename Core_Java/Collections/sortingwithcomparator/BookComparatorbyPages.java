package sortingwithcomparator;

import java.util.Comparator;

public class BookComparatorbyPages implements Comparator<Book>{

	@Override
	public int compare(Book arg0, Book arg1) {
		return Integer.compare(arg0.getNumOfPages(), arg1.getNumOfPages());
	}

}
