package ch11_6.com.market.cart;

import ch11_6.com.market.bookitem.Book;

//장바구니 담은 책 1가지 정보
public class CartItem {
	private Book itemBook; //장바구니 담은 책 정보
	private String bookID; //장바구니 담은 책 ISBN
	private int quantity; //책 개수
	private int totalPrice; //책1권가격 * 장바구니담은 개수
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	//생성자
	//booklist : 장바구니 담은 책 1가지
	public CartItem(Book booklist) {
		itemBook = booklist;
		bookID = booklist.getBookId();
		//bookID = booklist.bookId;
		quantity = 1;
		updateTotalPrice();
	}
	public void updateTotalPrice() {
		System.out.println("=============================");
		System.out.println("updateTotalPrice() call");
		//System.out.println("itemBook.uniPrice="+itemBook.unitPrice);
		System.out.println("itemBook.getUnitPrice()="+itemBook.getUnitPrice());
		System.out.println("quantity="+quantity);
		//totalPrice = itemBook.unitPrice * quantity;
		totalPrice = itemBook.getUnitPrice() * quantity;
		System.out.println("totalPrice="+totalPrice);
		System.out.println("=============================");
	}
	public String getBookID() { return bookID;}
	public int getQuantity() {return quantity;}
	public int getTotalPrice() {return totalPrice;}
	
	public static void main(String[] args) {
//		Book b = new Book("ISBN1234", "파이썬 첫걸음", 33000);
//		System.out.println("b.bookId="+b.bookId);
//		System.out.println("b.name="+b.name);
//		System.out.println("b.unitPrice="+b.unitPrice);
//		
//		CartItem c = new CartItem(b);
//		System.out.println("c.bookID="+c.bookID);
//		System.out.println("c.quantity="+c.quantity);
//		System.out.println("c.totalPrice="+c.totalPrice);
//		System.out.println("c.itemBook="+c.itemBook);
	}
}

