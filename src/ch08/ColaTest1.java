package ch08;

class Cola {
	String name;
	int price;
	/*
	 * 클래스에 생성자가 없으면 자바가 자동으로
	 * Cola 클리스(Cola.class)에 생성자를 만들어서 추가해 줌.
	 * 
	 * 자바가 만들어서 넣어주는 생성자 -> '디폴트 생성자' 라고 한다.
	 * 
	 * 디폴트 생성자 : 매개 변수도 없고 하는 일도 없음!! 
	 * 아래처럼 생겨먹음^^
	 * public Cola() {
	 * 
	 */
	
}

public class ColaTest1 {

	public static void main(String[] args) {
		
		Cola c1 = new Cola();
		c1.name = "커피콜라";
		c1.price = 3600;
		
		System.out.println("c1.name ="+c1.name);
		System.out.println("c1.price ="+c1.price);

	}

}
