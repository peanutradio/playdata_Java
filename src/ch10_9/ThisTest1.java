package ch10_9; //this 키워드 + this()

class Item {
	String name;
	int price;
	Item() {
//		this.name = "무명";
//		this.price = -1;
//		if (this.price < -100) this.price = -100;
		this("무명", -1);
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("Item() call");
		System.out.println("+++++++++++++++++++++++++++++++++");
	}
	
	Item(String name, int price) { // 매개변수 
		System.out.println("=================================");
		System.out.println("Item(String, int) call");
		if (this.price < -100) this.price = -100;
		System.out.println("=================================");
	}
}

public class ThisTest1 {

	public static void main(String[] args) {
		Item item1 = new Item();
		System.out.println("item1="+item1);
   		item1.price = 30000000;
   		System.out.println("item.price = "+ item1.price);
   		System.out.println("item1.name = "+ item1.name);
	}
}
