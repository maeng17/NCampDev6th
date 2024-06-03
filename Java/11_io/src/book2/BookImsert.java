package book2;

import java.util.List;
import java.util.Scanner;

public class BookImsert implements Book {

	@Override
	public void execute(List<BookDTO> list) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
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
		
		int total = price * qty;
		
		BookDTO bookDTO = new BookDTO(code, title, author, price, qty);
		bookDTO.setTotal(total);
		
		System.out.println("항목을 추가하였습니다.");
		list.add(bookDTO);
		


	}

}
