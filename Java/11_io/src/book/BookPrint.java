package book;

import java.util.ArrayList;

public class BookPrint implements Book {

	@Override
	public void execute(ArrayList<BookDTO> list) {
		System.out.println("code\ttitle\tauthor\tprice\tqty\ttotal");
		
		for(BookDTO bookDTO : list) {
			System.out.println(bookDTO);
		}
		
	}

}