package ch08_ex;

public class HeroTest {

	public static void main(String[] args) {
		//생성자 호출 , 두 Hero 객체 만들기
		Hero ironMan = new Hero(" 아이언맨 ", 100, 120);
		Hero hulk = new Hero(" 헐크 ", 200, 80);
		
		// 객체 정보 출력
		System.out.println(ironMan.toStr());
		System.out.println(hulk.toStr());
		
	}
	//Hero class
	static class Hero {
		String name;
		int power;
		int speed;
		
	// 생성자 정의
		Hero(String n, int p, int s) {
			name = n;
			power = p;
			speed = s;
		}
	
	//객체 정보를 문자열로 반환
		String toStr() {
			return String.format("Hero{name: %s, power: %d, Speed: %d}",
					name,power, speed);
		}

	}
}
