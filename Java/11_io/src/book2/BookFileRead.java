package book2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class BookFileRead implements Book {

	@Override
	public void execute(List<BookDTO> list) {
		System.out.println();
		list.clear(); // 초기화
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"));
			
			//파일에서 새로운 List를 읽은 다음 기존에 있는 List에 항목 담기.
			List<BookDTO> load = (List<BookDTO>) ois.readObject();
			for(BookDTO bookDTO : load) {
				list.add(bookDTO); //list의 값을 지우고 load에 저장한 다음 list에 추가
			}
			
			//파일에서 BookDTO를 1개씩 꺼내서 list에 담기
			//while(true) {
			//	try {
			//		BookDTO bookDTO = (BookDTO) ois.readObject();
			//		list.add(bookDTO);
			//	} catch(EOFException e) {
			//		break;
			//	}
			//}
			ois.close();
			System.out.println("파일에서 모든 항목을 로드하였습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
