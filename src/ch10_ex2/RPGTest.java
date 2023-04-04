package ch10_ex2; // 상속을 통한 클래스 확장.

public class RPGTest {

	public static void main(String[] args) {
		Wizard wizard = new Wizard(); // Wizard 객체 생성 
		wizard.speed = 2; // wizard 객체 초기화
		wizard.move(); // 메소드 수행
		
		Knight knight = new Knight(); // Kight 객체 생성 
		knight.name = "King Arthour";
		knight.hp = 150;    // knight 객체 초기화
		knight.stamina = 70;
		knight.punch(); //메소드 수행 
		knight.slash();
		knight.speed = 2;
		knight.move();
	}
}

class Novice { //부모 클래스 
	String name;
	int hp;
	int speed;
	void punch() {
		System.out.printf("%s(HP ; %d)의 펀치!\n", name, hp );
	} 
	void move() {
		System.out.printf("%d만큼 이동합니다.\n", speed );
	}
	
}
class Wizard extends Novice { // 상속받은 자녀 클래스 
	int mp;
	void fireball() {
		System.out.printf("%s(HP ; %d, MP: %d)의 파이어볼!\n", name, hp, mp );
	}
}
class Knight extends Novice { // 상속받은 자녀 클래스 
	int stamina;
	void slash() {
		System.out.printf("%s(HP ; %d, ST: %d)의 슬래쉬!\n", name, hp, stamina );
	}
}