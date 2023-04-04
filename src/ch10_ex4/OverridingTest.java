package ch10_ex4; //오버라이딩 실습 

public class OverridingTest {

	public static void main(String[] args) {
		Archer a = new Archer();
		Archer ma = new MasterArcher(); // 업 캐스팅
		a.shoot();
		ma.shoot();
	}
}

class Archer{
	void shoot() {
		System.out.println("[아처]의 활 공격이 10만큼의 피해를 주었습니다.");
	}
}

class MasterArcher extends Archer {
	void shoot() { //메소드 오버라이딩: 자식이 부모의 함수 이름 가져다가 씀.
		System.out.println("[마스터]의 활 공격이 30의 피해를 주었습니다. ");
	}
}