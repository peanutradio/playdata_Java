package ch11_6.com.market.cart;

import ch11_6.com.market.bookitem.Book;

//장바구니 관리
public class Cart implements CartInterface{
	//전체 책 종류
	static final int NUM_BOOK = 3;
	//장바구니
	public CartItem[] mCartItem = new CartItem[NUM_BOOK];
	//장바구니 담은 책 권수
	public static int mCartCount=0;
	
	//장바구니에서 책 하나 삭제
	//numId : 장바구니에서 삭제 하고 싶은 책의 인덱스
	public void removeCart(int numId) {
		//새 장바구니!!
		CartItem[] cartItem2 = new CartItem[NUM_BOOK];
		//새장바구니에 담은 책 개수
		int num = 0;
		
		for(int i=0; i<mCartCount;i++) {
			System.out.println("i="+i);
			System.out.println("제외할 인덱스 numId="+numId);
			
			if(i!=numId) {
				System.out.println("i와 numId 다름!! cartItem2에 저장!!");
				cartItem2[num] = mCartItem[i];
				num++;
			}			
			
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		}
		mCartItem = cartItem2;
		mCartCount = num;
		
	}
	//매개변수 : id -> 장바구니에 있는지 알고 싶은 책의 ISBN
	//장바구니에 책이 있으면 true 리턴 없으면 false 리턴
	public boolean isCartBook(String id) {
		//리턴값 초기화 false 라고 시작
		boolean flag = false;
		for(int i=0;i<mCartCount;i++) {
			System.out.println("mCartItem["+i+"].getBookID()="
					+mCartItem[i].getBookID());
			System.out.println("id="+id);
			if(id.equals(mCartItem[i].getBookID())) {
				System.out.println("장바구니 있네!!!");
				System.out.println("mCartItem[i].getQuantity()="
				                      + mCartItem[i].getQuantity() );
				
				mCartItem[i].setQuantity( mCartItem[i].getQuantity() + 1  );
				
				System.out.println("개수 1증가 한 후 개수");
				System.out.println("mCartItem[i].getQuantity()="
	                      + mCartItem[i].getQuantity() );
				
				flag=true;
				break;
			}
			System.out.println("##############################");
		}
		return flag;
	}
	
	//장바구니 완전 비우기
	public void deleteBook() {
		mCartItem = new CartItem[NUM_BOOK];
		mCartCount = 0;
	}
	public void printCart() {
		System.out.println("장바구니 목록");
		for(int i=0; i<mCartCount; i++) {
			System.out.println("mCartItem["+i+"].getBookID()="
		                    +mCartItem[i].getBookID());
			System.out.println("mCartItem["+i+"].getTotalPrice()="
					+mCartItem[i].getTotalPrice());
			System.out.println("mCartItem["+i+"].getQuantity()="
					+mCartItem[i].getQuantity());
			System.out.println("===========================");
		}
	}
	
	//장바구니에 책 추가
	//p : 장바구니에 추가 할 책
	public void insertBook(Book p) {
		mCartItem[mCartCount] = new CartItem(p);
		mCartCount++;		
	}
	
	//전체 책 정보 출력
	//allbook :전체 책정보 저장 배열
	public void printBookList(Book[] allbook) {
		for(int i=0;i<allbook.length;i++) {
//			Book b = allbook[i];
//			System.out.println("b.bookId="+b.bookId);
//			System.out.println("allbook["+i+"].bookId="+allbook[i].bookId);
			System.out.println(allbook[i].getBookId());
			System.out.println("=========================");
		}
	}




	public static void main(String[] args) {
		Book b1 = new Book("ISBN1234","파이썬", 33000);
		Book b2 = new Book("ISBN1235","JSP", 27000);
		
		Book[] booklist = {b1,b2};
		
		Cart c = new Cart();
		c.printBookList(booklist);
		
		c.insertBook(b1); c.insertBook(b2);
		System.out.println("장바구니 목록!!");
//		for(int i=0;i<c.mCartItem.length; i++) {
//			CartItem it = c.mCartItem[i];
//			System.out.println("it.bookID="+it.getBookID());
//			System.out.println("it.totalPrice()="+it.getTotalPrice());
//			System.out.println("=================================");
//		}
		c.printCart();
		
		//장바구니 비우기
		//c.deleteBook();
		//System.out.println("장바구니 비우고 나서 출력!!!");
		//c.printCart();
		System.out.println("ISBN1235가 장바구니에 있는지 알고 싶다!!!");
		System.out.println("====================================");
		c.isCartBook("ISBN1235");
		System.out.println("장바구니에서 인덱스1 지우고 싶다!!");
		System.out.println("====================================");
		c.removeCart(1);
		System.out.println("장바구니에서 인덱스1 지운 후 리스트!!");
		System.out.println("====================================");
		c.printCart();
	}

}