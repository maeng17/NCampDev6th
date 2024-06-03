package book2;

import java.util.Comparator;
import java.util.List;

public class BookTitleDesc implements Book {

	@Override
	public void execute(List<BookDTO> list) {
		Comparator<BookDTO> com = new Comparator<BookDTO>()	{

			@Override
			public int compare(BookDTO b1, BookDTO b2) {
				return b1.getTitle().compareTo(b2.getTitle()) * -1;
						
			}
			
		};
		list.sort(com);

	}

}
