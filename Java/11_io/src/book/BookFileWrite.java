package book;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BookFileWrite implements Book {

	@Override
	public void execute(ArrayList<BookDTO> list) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt"));
		
		for(BookDTO bookDTO : list) {
			oos.writeObject(bookDTO);
		}
		oos.close();
		
	}

}