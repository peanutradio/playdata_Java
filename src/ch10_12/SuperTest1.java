package ch10_12; //super 키워드.

class Item {
	String name;
	int price;
	void printInfo() {		
		System.out.println("Item printInfo()");
		System.out.println("name="+name);
		System.out.println("price="+price); // 시가 check, 현재 시가를 옆에 출력.
	}
}

class Weapon extends Item {
	int power;
	void printInfo() {
		System.out.println("Weapon printInfo()");
//		printInfo(); // 이건 내 것 불러내는 것. 
//		this.printInfo(); // 이것도 내 것 불러내는 것.
		super.printInfo(); // 이것이 부모의 함수를 불런내는 것.
//		System.out.println("name="+name);
//		System.out.println("price="+price);
//		System.out.println("power="+power);
	}
}

public class SuperTest1 {

	public static void main(String[] args) {
		Weapon w1 = new Weapon();
		w1.name = "장검";
		w1.price = 80000000;
		w1.power = 10;
		w1.printInfo();
	}
}
