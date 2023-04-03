package ch08_ex2;

public class CoffeTest {

	public static void main(String[] args) {
		// Coffee 객체를 생성하고, 이름과 가격을 초기화한다.
		Coffee c = new Coffee("아메리카", 3000);
		
		// 현재 가격과 이름을 출력한다.
		System.out.printf("%s(%d원) -> ", c.getName(), c.getPrice());
		
		// 가격을 500원 인상시킨다.
		c.setPrice(c.getPrice()+500);
		
		// 변경된 가격과 이름을 출력한다.
		System.out.printf("%s(%d원)", c.getName(), c.getPrice());
	}
}

class Coffee {
	private String name; // 커피 이름을 저장할 변수
	private int price; // 커피 가격을 저장할 변수
	
	public Coffee(String n, int p) { // 생성자
		name = n;
		price = p;
	}
	
	public String getName() { // 이름을 반환하는 getter 메소드
		return name;
	}
	
	public int getPrice() { // 가격을 반환하는 getter 메소드
		return price;
	}
	
	public void setPrice(int p) { // 가격을 변경하는 setter 메소드
		price = p;
	}
}
