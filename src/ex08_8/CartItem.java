package ex08_8;

public class CartItem {
	//장바구니 담은 책종류
	private String[] itemBook = new String[7];
	//장바구니 담은 책 ISBN
	private String bookID;
	//장바구니 담은 책 개수
	private int quantity;
	//장바구니 담은 책 가격(단가*개수)
	private int totalPrice;
			
	public CartItem() {
		
	}
	
	//매개변수 book : 장바구니 담은 책 1종류의 정보
	public CartItem(String[] book) {
		itemBook=book;
		bookID = book[0];
		quantity = 1;
		//updateTotalPrice();
	}
	//책정보 리턴
	public String toStr() {
		return "CartItem[bookID="+bookID+",quantity="+quantity
				+",totalPrice="+totalPrice+"]";
	}	
	public static void main(String[] args) {
		String[] cbook = new String[3];
		cbook[0]="ISBN1234";cbook[1]="JSP 30일 완성!!!";cbook[2]="330000";
		
		//CartItem 객체 생성
		CartItem citem = new CartItem(cbook);
		System.out.println("citem.toStr()="+ citem.toStr());

	}

}