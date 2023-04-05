package ch10_ex11;

public class MoreKeywords_super { //super

	public static void main(String[] args) {
		Weapon w1 = new Weapon("장검", 1200, 10);
		Weapon w2 = new Weapon();
		w1.printInfo();
		w2.printInfo();
	}
}

abstract class Item {
	String name; // 이름
	int price; // 가격
	Item(String name, int price){
		this.name = name;
		this.price = price;
	}
	Item(){
		this.name = "이름없음";
		this.price = -1;
	}
}

class Weapon extends Item {
	int power;
	Weapon(String name, int price, int power){
		super(name, price); // 부모 생성자 호출
		this.power = power;
	}
	Weapon() {
		super();
		this.power = -1;
	}
	void printInfo() {
		System.out.printf("[%s] 가격 : %d 골드, 공격력: %d\n", 
							super.name, super.price, this.power);
		                    // 부모 name,부모 price   , 현재 객체의 power 필드.
 }
}