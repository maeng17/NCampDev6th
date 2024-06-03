package book;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookTitleDesc implements Book {
	ArrayList<BookDTO> list =new ArrayList<BookDTO>();

	@Override
	public void execute(ArrayList<BookDTO> list) throws IOException, ClassNotFoundException {
		
		
		Comparator<BookDTO> com = new Comparator<BookDTO>() {
			@Override
			public int compare(BookDTO b1, BookDTO b2) {
				return b2.getTitle().compareTo(b1.getTitle());
			}
		};
		Collections.sort(list,com);
		
		System.out.println("code\ttitle\tauthor\tprice\tqty\ttotal");
		
		for(BookDTO bookDTO : list) {
			System.out.println(bookDTO);
		}
		
	}

}