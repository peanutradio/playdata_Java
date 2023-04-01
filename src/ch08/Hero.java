package ch08;

public class Hero { // Hero 클래스
	String name;
	int power;
	int speed;

	Hero(String n, int p, int s) { // 인스턴스 변수 초기화 
		name = n;
		power = p;
		speed = s;
	}

	String toStr() { // 객체 정보를 문자열로 반환.
		String result = String.format("Hero:name=%s,power=%d,speed=%d\n", name, power, speed);
		System.out.println("toStr():result=" + result);
		System.out.println("toStr() end!!!");
		return result;
	}
}