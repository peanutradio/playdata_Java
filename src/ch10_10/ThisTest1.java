package ch10_10; //this 키워드

class Item {
	String name;
	int price;
	Item(String name, int price) { // 매개변수 
		System.out.println("매개변수 name = "+name  +
				           ", 매개변수 price="+price);
		System.out.println("this = "+this);
		
		System.out.println("속성 name = "+ this.name );
		System.out.println("속성 price = "+ this.price );
//		this.name = "홍길동";       // 매개변수.
//		this.price = 40000000;
		this.name = name;
		this.price = price;

		System.out.println("매개변수 대입 후!!! ");
		System.out.println("속성 price = "+ this.price );
		System.out.println("속성 name = "+ this.name );
	}
}

public class ThisTest1 {

	public static void main(String[] args) {
		Item item1 = new Item("마법사", 1000);
		System.out.println("item1="+item1);
   		item1.price = 30000000;
   		System.out.println("item.price = "+ item1.price);
   		System.out.println("item1.name = "+ item1.name);
	}
}
