package ch10_13_1;

public class Item {
	//  다른 클래스에서 name 속성 사용불가.
	// 자식 클래스도 name 속성 사용불가!!!
	private String name; // 사용범위 순위 4위
	
	// default 접근 제어자.
	// 다른 패키지(폴더)에서 price 사용 불가!!
	// 같은 패키지(폴더)에서 price 사용 가능!!!
	// 자식 클래스도 패키지(폴더) 다르면 price 사용 불가!!
	int price;// 사용범위 순위 3
	
	// 같은 패키지(폴더)에서 last_sale_price 사용 가능하다. (자식, 일반클래스 다)
	// 자식 클래스면 다른 패키지에서도 사용 가능(}extends
	// 일반 클래스면 다른 패키지에서 사용 불
	protected int last_sale_price;// 사용범위 순위 2위
	
	// 모든 클래스에서 사용 가능!!!
	public int hp;// 사용범위 순위 1위
}

class Weapon extends Item {
	int power;
	void printInfo() {
		//System.out.println("name="+name) //다른 클래스여서 상속불가 , 사용 불가 
		System.out.println("price="+price);
		System.out.println("hp="+hp);
		last_sale_price=10000000; // protect 같은 class 사용 가능.
		
	}
}
