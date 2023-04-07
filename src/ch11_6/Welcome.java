package ch11_6;

import ch11_6.com.market.bookitem.Book;

import ch11_6.com.market.cart.Cart;
import ch11_6.com.market.user.User;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Welcome {
	//책 개수
	static final int NUM_BOOK = 2;
	//장바구니 관리 객체
	static Cart mCart = new Cart();
	//맨처음 입력한 고객 정보
	static User mUser = new User("홍길동", 123456);
	
	public static void printBill(String name, String phone, String address) {
		//현재 날짜와 시간!! Fri Apr 07 14:43:50 KST 2023 (미국 스타일)
		Date now = new Date();
		System.out.println("now="+now);
		//날짜 스타일 수정할 객체 생성
		SimpleDateFormat formatter = 
				 new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String strDate = formatter.format(now);
		System.out.println("strDate="+strDate);
		
		System.out.println("name="+name);
		System.out.println("phone="+phone);
		
	}
	public static void BookList(Book[] booklist) {
		booklist[0] = new Book("ISBN1234", "JSP", 33000);
		booklist[1] = new Book("ISBN1235","안드로이드", 27000);
	}
	public static void menuCartAddItem(Book[] booklist) {
		BookList(booklist);
		//책정보 리스트 조회
		mCart.printBookList(booklist);
		boolean quit = false;
		//while(!quit) {
			//장바구니 추가 할 책 ISBN(잘못 입력 할 수도)
			String str = "ISBN1235";
			//str이 존재하는 ISBN 이면 true 대입
			boolean flag=false;
			//str이 존재하는 ISBN이면 mBookList(전체 책 정보) 인덱스 대입
			int numId = -1;
			for(int i=0;i<NUM_BOOK; i++) {
				System.out.println("=======================");
				System.out.println("str="+str);
				System.out.println("booklist["+i+"].getBookId()="
				                   +booklist[i].getBookId());
				if(str.equals(booklist[i].getBookId())) {
					System.out.println("str와 같음!!");
					numId = i;
					flag = true;
					break;
				}//end if
			}//end for
			if(flag) {
				System.out.println("numId="+numId);
				System.out.println("booklist["+numId+"].getBookId()"
				                    +booklist[numId].getBookId()
				                    );
				//장바구니에 이미 존재하는 ISBN -> 개수 1증가 true 리턴
				//장바구니에 존재하지 않는 ISBN -> false 리턴
				boolean exist = mCart.isCartBook( booklist[numId].getBookId() );
				System.out.println("exist="+ exist);
				if(!exist) {
					mCart.insertBook(booklist[numId]);
				}
			}
		//}//end while
	}//end method
	public static void menuCartRemoveItem() {
		System.out.println("mCart.mCartCount="+mCart.mCartCount);
		mCart.printCart();
		
		boolean flag = false;
		int numId = -1;
		
		String str = "ISBN1235";
		
		for(int i=0;i<mCart.mCartCount; i++) {
			System.out.println("=================");
			System.out.println("i="+i);
			System.out.println("str="+str);
			System.out.println("mCart.mCartItem["+i+"].getBookID()="
			                   +mCart.mCartItem[i].getBookID());
		}
	}
	public static void main(String[] args) {
		Book[]  mBookList = new Book[NUM_BOOK];
		menuCartAddItem(mBookList);
		//printBill("홍길순", "889977","서울");
		/* printBill(String name, String phone, String address) {...} 구현
		 * 
		 * mUser.getPhone() : 정수 int, User의 phone 속성 정수
		 */
		//printBill(mUser.getName(), mUser.getPhone(),"서울");
		
		//int 를 String 으로 변환!!
		//String.valueOf(정수값) => 정수가 String으로 변환!!
		String strPhone = String.valueOf(mUser.getPhone());
		printBill(mUser.getName(), strPhone, "서울");
		
		//menuCartRemoveItem();
//		BookList(mBookList);
//		for(int i=0;i<mBookList.length;i++) {
//			System.out.println("====================");
//			System.out.println("mBookList["+i+"].getBooID()="
//			   +mBookList[i].getBookId());
//			System.out.println("mBookList["+i+"].getName()="
//					   +mBookList[i].getName());
//		}//end for
	}//end main
}//end class