package ch11_4; // 인터페이스의 다형성.

class Bird {
	public void fly() {System.out.println("Bird : 새가 난다");}
}
class Helicopter {
	public void fly() {	System.out.println("Helicopter : 헬리콥터가 난다");}
	public void shoot() {System.out.println("Helicopter: 헬리콥터가 사격합니다"); 
}
class Gun {
	public void shoot() { System.out.println("Gun : 총으로 목표를 사격합니다");}
	}

public class UpcastingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
}