package book;

import java.io.IOException;

public class BookMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		BookService bookService = new BookService();
		bookService.menu();
		System.out.println("프로그램일 종료되었습니다.");

	}

}