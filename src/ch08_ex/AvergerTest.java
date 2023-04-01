package ch08_ex;

public class AvergerTest {

	public static void main(String[] args) {
		Avenger thor = new Avenger("토르", 150); // 2 개의 객체 만들기
		Avenger thanos = new Avenger("타노스", 1000);
		thor.punch(thanos); // 인스턴스 메소드 호출 -> 레퍼런스변수thanos 메소트로 전달
		thor.punch(thanos);
		thanos.punch(thor);
	}
}

class Avenger {
	String name;
	int hp;
	
	Avenger(String s, int i) {
		name = s;
		hp = i;
	}
	
	void punch(Avenger enemy) { // 레퍼런스 변수들이 입력변수enemy로 대입된다.
		                        // 그래서 레퍼런스 변수들이 enemy와 같은 객체를 가리키게 된다.
		System.out.printf("[%s]의 펀치", name);
		enemy.hp -= 10;
		System.out.printf(" -> %s의 체력 : %d\n", enemy.name, enemy.hp);
	}
}