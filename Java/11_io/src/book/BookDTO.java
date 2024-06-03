package book;

import java.io.Serializable;

public class BookDTO implements Comparable<BookDTO>, Serializable {
	private String code;
	private String title;
	private String author;
	private int price;
	private int qty;
	private int total;
	
	public BookDTO(String code, String title, String author, int price, int qty) {
		super();
		this.code = code;
		this.title = title;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	
	public void calc() {
		total = price * qty;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return code + "\t"
				+ title + "\t"
				+ author + "\t"
				+ price + "\t"
				+ qty + "\t"
				+ total + "\t";
	}

	@Override
	public int compareTo(BookDTO b) {
		if (this.total > b.total) return -1;
		else if (this.total< b.total) return 1;
		else return 0;
	}
	
	
	
	
	
}