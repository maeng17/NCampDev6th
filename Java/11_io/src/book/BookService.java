package book;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookService {
	private ArrayList<BookDTO> list = new ArrayList<BookDTO>();
	
	public void menu() throws IOException, ClassNotFoundException {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		Book book = null;
		int num;
		
		while (true) {
			System.out.println("-------------");
			System.out.println("\t1. 등록");
			System.out.println("\t2. 출력");
			System.out.println("\t3. 파일 저장");
			System.out.println("\t4. 파일 읽기");
			System.out.println("\t5. 제목으로 내림차순");
			System.out.println("\t6. 끝");
			System.out.println("-------------");
			System.out.print("번호 선택 : ");
			num = scan.nextInt();
			
			if(num == 6) break;
			else if(num == 1) book = new BookInsert();
			else if(num == 2) book = new BookPrint();
			else if(num == 3) book = new BookFileWrite();
			else if(num == 4) book = new BookFileRead();
			else if(num == 5) book = new BookTitleDesc();
		
			book.execute(list);
		}
		
		
	}

}