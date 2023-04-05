package ch10_ex12; //상속 관계에서 부모 클래스의 필드가 private 인 경우.

public class MoreKeywords {

	public static void main(String[] args) {
		Weapon w1 = new Weapon("장검", 1200, 10);
		Weapon w2 = new Weapon();
		w1.printInfo();
		w2.printInfo();
	}
}

abstract class Item {
	private String name; // 이름
	private int price;  // 가격
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Item() {
		this("이름 없음", -1);
	}
	
	public String getName() { 
		return name; 
	}  
	
	public int getPrice() { 
		return price; 
	}
}

class Weapon extends Item {
	private int power;    // 공격력 //private-외부접근 불가.
	
	public Weapon(String name, int price, int power) {
		super(name, price);
		this.power = power;
	}
	
	Weapon() {
		this("이름 없음", -1, -1);
	}
	
	void printInfo() {
		System.out.printf("[%s] 가격: %d 골드, 공격력: %d\n",
				super.getName(), super.getPrice(), this.power);
	}
}