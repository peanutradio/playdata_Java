package ch10_13_1;

public class AccessTest12 {

	public static void main(String[] args) {
		Item i1 = new Item();
		//i1.name = "안녕"; // 같은 패키지 private 여서 사용 불
		i1.price = 1000; // 같은 패키지 사용 가
		i1.hp = 10;  // 같은 패키지 public 이여서 사용 가능.
		i1.last_sale_price = 10000000;// protect 같은 폴더에서 사용 가능.

	}

}
