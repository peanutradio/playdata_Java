package ch10_ex10; // this

public class MoreKeyWords {

	public static void main(String[] args) {
		Item item1 = new Item("마법사의 지팡이", 1000);
		System.out.printf("[%s](%d골드) 생성 완료\n", item1.name, item1.price);
		}
	}

class Item {
	String name;
	int price;
	Item(String name, int price){ // 입력 변수가 String, int인 생성자.
		this.name = name; // 생성자 수행 객체의 name / 입력변수 name
		this.price = price; // 생성자 수행 객체의price / 입력변수 price	
	}
	Item() { // 코드의 중복을 제거하기 위해 자신을 호출할 때 this() 사용.
		this("이름 없음", -1);
	}
}
