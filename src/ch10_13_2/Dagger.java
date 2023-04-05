package ch10_13_2; // 접근제한자.

import ch10_13_1.Item;

public class Dagger extends Item {
	void printInfo() {
		// private여서 다른 클래스 상속 불가.
		System.out.println("name="+name);
		// 일반 이여서 다른 폴더 사용 불가.
		System.out.println("price="+price);
		// public이여서 상속 받을 수 있음.
		System.out.println("hp="+hp);
		
		// protected는 다른 패키지여도 ''자식클래스''에서는 사용 가능하다!!
		last_sale_price=10000000;
		
	}

	
	
}
