package ch10_ex13; // 상속 관계에서 부모 클래스의필드를 protected로 개선.

public class MoreKeywords {

	public static void main(String[] args) {
		Weapon w1 = new Weapon("장검", 1200, 10);
		Weapon w2 = new Weapon();
		w1.printInfo();
		w2.printInfo();
	}
}

abstract class Item {
	protected String name; // 이름
	protected int price;  // 가격
	
	Item(String name, int price) {
		this.name = name;
		this.price = price;
	}	
	
	Item() {this("이름 없음", -1);} // this를 통한 생성자 호
}

class Weapon extends Item {
	protected int power;    // 같은 내부 패키지 코드 또는 자식 클래스 접근 가능.
	Weapon(String name, int price, int power) {
		super(name, price);
		this.power = power;
	}
	
	Weapon() {
		this("이름 없음", -1, -1); //this 를 통한 생성자 호출.
	}
	
	void printInfo() {
		System.out.printf("[%s] 가격: %d 골드, 공격력: %d\n",
				super.name, super.price, this.power);
	}
}