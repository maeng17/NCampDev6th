package book;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class BookFileRead implements Book {

	

	@Override
	public void execute(ArrayList<BookDTO> list) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"));
		BookDTO bookDTO2 = (BookDTO) ois.readObject();
		
		for (BookDTO bookDTO : list) {
			System.out.println(bookDTO);
		}
		ois.close();
		
	}

}