package ch08; // 디폴트 생성자 만들기.

class Drink{
	String name;
	int price;
	
	Drink(String n, int p){ // 입력 변수가 있는 생성자
		System.out.println("Drink(String,int) start!!!");
		name=n; price=p;
		System.out.println("Drink(String,int) end!!!");
		System.out.println("============================");
	}
	Drink(){ // 입력 변수가 없는 생성자
		System.out.println("Drink() start");
		name="이름없음!!";
		System.out.println("Drink() end");
		System.out.println("============================");
	}
	/*
	 * 같은 생성자 여러개 있는건 안됨!!
	 * 생성자의 매개변수 개수, 매개변수 타입, 매개변수 타입과 개수 다르게 여러개 중복 가능
	Drink(){
		System.out.println("Drink() start");
		name="이름없음!!";
		System.out.println("Drink() end");
		System.out.println("============================");
	}
	*/
}
public class DrinkTest1 {

	public static void main(String[] args) {
		System.out.println("Drink() call");
		Drink d1 = new Drink();
		System.out.println("d1.name="+d1.name);
		System.out.println("d1.price="+d1.price);
		
		System.out.println("Drink(\"박카스\",800) call");
		Drink d2 = new Drink("박카스", 800);
		System.out.println("d2.name="+d2.name);
		System.out.println("d2.price="+d2.price);
	}
}
