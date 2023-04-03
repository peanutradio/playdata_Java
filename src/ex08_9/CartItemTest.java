package ex08_9;

import java.util.Scanner;

public class CartItemTest {
	// 전체 책의 수.
	static final int NUM_BOOK = 3; // static은 상수. 못 바꿈.
	// 책 정보 수 -> ISBN, 제목, 가격, 저자, 설명, 종류, 출판일.
	static final int NUM_ITEM = 7;	
	// 장바구니 담은 책 정보를 저장할 배열.
	static CartItem[] mCartItem = new CartItem[NUM_BOOK];
	//장바구니 담은 책 개수
	static int mCartCount = 0;
    public static void main(String[] args) {
		// 전체 책 정보.
    	String [][] book = {
    			              {"ISBN1234", "JSP", "33000", "몰라", "없음","IT", "몰라"  }, //[0]-> 이 안에 [0]~[6]까지 존재
    			              {"ISBN1235", "안드로이드", "27000", "우재남", "없음","IT", "2023"  },//[1]-> 이 안에 [0]~[6]까지 존재
    			              {"ISBN1236", "스트래치", "22000", "고광일", "없음","IT", "2022"  }, //[2]-> 이 안에 [0]~[6]까지 존재
                        	};
    // true 이면 반복 종료!
    boolean quit = false;
    // !quit -> quit 가 true이면 false, quit가 false이면  true.
    while(!quit) {
    	System.out.println("장바구니에 추가할 도서의 ID를 입력하세요 :");
    	Scanner input = new Scanner(System.in);
    	String str = input.nextLine();
    	System.out.println("str="+str);
    	
    	boolean flag = false;
    	int numId = -1;
    	
    	System.out.println("for문 실행=============================");
    	for(int i=0; i<NUM_BOOK; i++) {
    		System.out.println("book["+i+"][0] = "+ book[i][0]);
    		
    		if  (str.equals(book[i][0])) {
    			System.out.println("str booki[][0] 같음!!");
    			numId =i;
    			flag = true;
    			break;
    		}
    		System.out.println("==============================");
    	}//end for
    	System.out.println("numId="+numId);
    	System.out.println("flag="+flag);
    	
    	if(flag) {
    		System.out.println("추가?");
    		str = input.nextLine();
    		System.out.println("str="+str);
    		// str.toUpperCase() : 소문자 대문자로 변환, 대문자는 냅둠
    		System.out.println("str.toUpperCase()="+str.toUpperCase()); //소문자면 대문자로 변경
    		
    		if (str.toUpperCase().equals("Y")) {
    			System.out.println("sr.toUpperCase() Y와 같음");
    			
    			System.out.println("numId = "+ numId);
    			System.out.println("book["+numId+"][0]="+book[numId][0]);
    			
    			// mCartItem에 이미 존재하는 book[numId][0] 일 때, quantity만 1 증가.
    			boolean alreadyExist = false;
    			// book[numId][0]: 장바구니 담으려고 하는 책 ISBN
    			String bookId = book[numId][0];
    			System.out.println("book["+numId+"][0]");
    			System.out.println("bookId="+bookId);
    			System.out.println("장바구니 담은 책 개수 mCartCount="+mCartCount);
    			for(int i=0; i<mCartCount;i++) {
					System.out.println("mCartItem["+i+"]");
//					// 장구니에 담은 i번째 책
//					CartItem c = mCartItem[i];
//					System.out.println("c.getBookID()="+ c.getBookID());
//					// bookId: 장바구니 담을 책 ISBM
//					// C.getBookId() : 장바구니 담은 ISBN
//					if (bookId.equals(c.getBookID())) {
//						// c.getQuantity() : 장바구니에 담은 책의 개수
//						int newQuantity = c.getQuantity() + 1;
//						System.out.println("bookId c.getBookID 같음");
//						System.out.println("newQuantity="+newQuantity);
//						c.setQuantity(newQuantity);
//						alreadyExist=true;
//						break;
//					}
					
					System.out.println("mCartItem[i].getBookID()="
					                    + mCartItem[i].getBookID());
					if(bookId.equals(mCartItem[i].getBookID())) {
						mCartItem[i].setQuantity(mCartItem[i].getQuantity()+1);
						alreadyExist=true;
						break;
					}
					
    			}
    			if(alreadyExist==false ) {
				//장바구니 담은 책 정보 1개
//    			CartItem c1 = new CartItem(book[numId]);
//				System.out.println("c1.bookID="+c1.getBookID());
//				System.out.println("c1.totalPrice="+ c1.getTotalPrice());
//				System.out.println("m.countItem["+mCartCount+"]=c1");
//				//mCartItem에 c1 추가
//				mCartItem[mCartCount] = c1;
				mCartItem[mCartCount] = new CartItem(book[numId]);
				mCartCount++;	
				//mCartItem[mCartCount++] = new CartItem(book[numId]);
    			}
			}//end if
		}//end if(flag)
    	System.out.println("장바구니 목록");
    	System.out.println("===================================================");
    	for (int i=0; i<mCartCount; i++) {
    		// mCratItem : 장바구니 담은 책 정보 저장 배열 
    		CartItem item = mCartItem[i];
    		System.out.println("item.getBookID()="+ item.getBookID());
    		System.out.println("item.getQuantity()="+ item.getQuantity());
    		System.out.println("mCartItem["+i+"].getBookID()="
    		                       +mCartItem[i].getBookID());
    		System.out.println("mCartItem["+i+"].getQuantity()="
    				+mCartItem[i].getQuantity());
    	}
    	System.out.println("===================================================");
	}//end while
}//end main
}//end class
