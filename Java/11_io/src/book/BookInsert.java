package book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookInsert implements Book {
	ArrayList<BookDTO> list = new ArrayList<BookDTO>();

	@Override
	public void execute(ArrayList<BookDTO> list) {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		
		System.out.print("code : ");
		String code = scan.next();
		System.out.print("title : ");
		String title = scan.next();
		System.out.print("author : ");
		String author= scan.next();
		System.out.print("price : ");
		int price = scan.nextInt();
		System.out.print("qty : ");
		int qty = scan.nextInt();
		System.out.println();
		
		BookDTO bookDTO = new BookDTO(code, title, author, price, qty);
		bookDTO.calc();
		
		list.add(bookDTO);
		
		System.out.println("입력되었습니다.");
		
		
	}
	
}
