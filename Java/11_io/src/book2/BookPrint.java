package book2;

import java.util.List;

public class BookPrint implements Book {

	@Override
	public void execute(List<BookDTO> list) {
		System.out.println();
		
		
		System.out.println("code\ttitle\tauthor\tprice\tqty\ttotal");
		
		for(BookDTO bookDTO : list) {
			System.out.println(bookDTO);
		}
		

	}

}
