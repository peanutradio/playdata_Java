package ex10_4;

class Archer {
	String name; // 업캐스팅과 메서드 오버라이딩~~!!! 오류 확인
	int hp;
	void shoot() {
		hp -=10;
		System.out.println("Archer.shoot!!");
		System.out.println("name="+name+",hp="+hp+",공격~~!!!");
	}
}
class MasterArcher extends Archer {
	void Shoot() {     // 부모 클래스와 똑같은 이름 메서드 구현 ( override )
		hp -=2;        //    -> 업캐슽팅 때문!!!
		System.out.println("MasterArcher.shoot!!!");
		System.out.println("name="+name+",hp="+hp+",마스터 공격~~!!!");
		
	}
}

public class OverridingTest1 {

	public static void main(String[] args) {
		Archer a = new Archer();
		a.name = "아처"; a.hp = 1000;
		a.shoot();
		
		MasterArcher ma = new MasterArcher();
		a.name = "마스터 아처"; ma.hp = 100;
		ma.shoot();
		ma.Mastershoot();
		
		// shoot 부모여서 호출 가능, masterhoot는 부모여서 호출 불가...
		Archer[] arr = {a, ma}; 
		for(int i=0; i<arr.length; i++) {
			System.out.println("==============");
			System.out.println("arr["+i+"].shoot()");
			arr[i].shoot();
			arr[i].Mastershoot();  // 에러난다..
			System.out.println("==============");
		}					
		
		
	}

}
