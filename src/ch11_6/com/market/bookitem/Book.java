package ch11_6.com.market.bookitem;

public class Book extends Item{
	private String author;
	private String description;
	
	public Book(String bookId, String name, int unitPrice) {
		super(bookId, name, unitPrice);
	}
	public Book(String bookId, String name, int unitPrice, String author) {
		super(bookId, name, unitPrice);
		this.author = author;
	}
	public String getBookId() { return bookId;}
	public String getName() {return name;}
	public int getUnitPrice() {return unitPrice;}
}