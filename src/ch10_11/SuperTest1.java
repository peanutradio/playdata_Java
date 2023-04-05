package ch10_11; // super 키워드

class Item{
	String name;
	int price = 10000;
	
	void punch() {
		price -= 10;
		System.out.println("Item punch price="+price+", name="+name);
	}
}
class Weapon extends Item {
	int price = 20000;
	int power;
	void printInfo() {
		System.out.println("name = "+name+", price="+price+""
			             	+ ", power="+power); // 내 price
		System.out.println("super.price="+super.price); // super: 부모 price
		System.out.println("this.price = "+this.price); // this: 다시 내 price
		
		System.out.println("===========================");//내 것
		System.out.println("punch() call");
		punch();
		System.out.println("===========================");// 부모 	
		System.out.println("super.punch() call");
		super.punch();
		System.out.println("==========================="); // 내 것
		System.out.println("this.punch() call");
		this.punch();
	}
	void punch() {
		price -= 100;
		System.out.println("Weapon punch price = "+price);
	}
}

public class SuperTest1 {

	public static void main(String[] args) {
		Weapon w1 = new Weapon();
		w1.name = "장검";
		w1.power = 100;
		w1.printInfo();
		w1.punch();
		
		Item i1 = new Item();
		i1.name = "나무막대기";
		i1.punch();	
	}
}
