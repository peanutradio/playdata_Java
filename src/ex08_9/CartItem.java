
package ex08_9;

//장바구니 담은 책1권의 정보 저장
public class CartItem {
    //책 1권 정보 저장된 배열
	//예) ISBN1235 , 안드로이드프로그래밍, 33000, 우재남, 단계별멘토링, IT전문서, 2022/01/22
	private String[] itemBook = new String[7];
	//장바구니 담은 책의 ISBN
	//예)ISBN1235
	private String bookID;
	//장바구니 담은 책 권수
	//예) 3
	private int quantity;
	//가격
	//단가 * 권수
	//예) 33000 * 3
	private int totalPrice;
	
	//입력값 없는 생성자
	public CartItem() {
		
	}
	//입력값 있는 생성자
	//매개변수 book : 장바구니 담을 책 정보
	//예) book => {
	//             "ISBN1235","안드로이드 프로그래밍","33000",
	//              "우재남","단계별 멘토링", "IT전문서","2022/01/22"
	//             }
	public CartItem(String[]book) {
		itemBook = book;
		bookID = book[0];
		quantity = 1;
		//단가 * 개수 -> 가격 계산
		updateTotalPrice();
	}
	public void updateTotalPrice() {
		System.out.println("itemBook[2]="+itemBook[2]);
		//totalPrice = quantity * itemBook[2]; -> 실행에러
		//String itemBook[2] 을 정수로 변환 : Integer.parseInt(itemBook[2])
		totalPrice = Integer.parseInt(itemBook[2]) * quantity ;
		System.out.println("totalPrice ="+ totalPrice);
	}
	//itemBook필드 : 장바구니 담은 책 정보
	//itemBook 필드 리턴
	public String[] getItemBook() {
		return itemBook;
	}
	//itemBook 필드 수정
//	public void setItemBook(String []book) {
//		itemBook = book;
//	}
	//매개변수 이름과 필드 이름이 같으면?
	public void setItemBook(String []itemBook) {
		//매개변수 itemBook
		//itemBook = itemBook;
		
		//필드 itemBook -> this.itemBook
		// 매개변수 itemBook -> itemBook
		this.itemBook = itemBook;
	}
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		//매개변수와 필드 이름이 bookID로 같다
		//필드 : this.bookID
		//매개변수 : bookID
		this.bookID = bookID;
		this.updateTotalPrice();
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		//매개변수이름과 필드 이름 같음
		//필드 : this.quantity
		//매개변수 : quantity
		this.quantity = quantity;
		updateTotalPrice();
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	
	public static void main(String [] args) {
		String [] mBook = {"ISBN1235","안드로이드 프로그래밍", 
				            "33000","우재남",
				            "멘토링","IT전문서", "2022/01/22"};
		CartItem c1 =new CartItem(mBook);		
		String [] cartBook1 = c1.getItemBook();
		System.out.println("================");
		System.out.println("cartBook1[0]="+ cartBook1[0]);
		System.out.println("cartBook1[1]="+ cartBook1[1]);
		System.out.println("================");
		
		String [] newBook = {
				 "ISBN1234","쉽게배우는 JSP","27000","송미영","쉽다","IT","몰라"
		        };
		c1.setItemBook(newBook);
		cartBook1 = c1.getItemBook();
		System.out.println("setItemBook 호출 후 ================");
		System.out.println("cartBook1[0]="+ cartBook1[0]);
		System.out.println("cartBook1[1]="+ cartBook1[1]);
		System.out.println("================");
		c1.setBookID(newBook[0]);
		c1.setQuantity(12);
		System.out.println("c1.getBookID()="+c1.getBookID());
		System.out.println("c1.getQuantity()="+c1.getQuantity());
		System.out.println("c1.getTotalPrice()="+c1.getTotalPrice());
		
	}//end main	
}//end class
