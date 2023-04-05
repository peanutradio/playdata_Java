package ch10_13_2; // 접근제한자.
import ch10_13_1.Item;

public class AccessTest2 {

	public static void main(String[] args) {
		Item i1 = new Item(); //
		i1.name = "안녕"; // pricate여서 상속 불가
		i1.price = 1000;  // 일반이여서 상속 불가 
		i1.hp = 10;   // Public이여서 상속 가능 
		//protect 다른 폴더에 사용 불가!!(자식 아니여서...)
		i1.last_sale_price = 10000000; 
	}

}
