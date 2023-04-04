package ex10_1;// 상속을 통한 중복코드 제거.

public class RPGTest {

	public static void main(String[] args) {
		Wizard wz = new Wizard(); // 객체생성
		wz.name = "간달프";
		wz.hp = 100;
		wz.mp = 80;
		wz.speed = 5;
		wz.punch();
		wz.fireball();
		wz.move();
   }
}

class Novice {
	String name; 
	int hp;
	int speed;

	void move() { // Novice 속성, 메소드 추가하면 자동으로 자녀까지 상속된다.
		System.out.println("speed="+speed+" 이동 ");
		
	}
	void punch() {
		System.out.println("name="+name+",hp="+hp+"펀치~~!!");
	}
}
class Wizard extends Novice{ // Novice의 속성과 메소드를 상속받는다.
	int mp;                  // 이 아래부터는 Wizard의 속성과 메소드.
	void fireball() {
		System.out.println("name = "+name +"hp"+hp);
		System.out.println("mp = "+mp +"파이어볼~!!");
	}
}

