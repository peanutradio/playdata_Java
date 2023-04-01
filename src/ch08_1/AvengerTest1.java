package ch08_1; // 레퍼런스 함수 공유 3

class Avenger {
	void punch (Avenger enemy) {
		System.out.println(name+"의 한방!!");
		System.out.println("enemy.toStr()="+enemy.toStr());
		enemy.hp -= 10;
		System.out.println("hp 감소후!! enemy.toStr()="+ enemy.toStr());
		
	}
	String name;
	int hp;
	
	Avenger(String s, int i){
		name = s;
		hp = i;
	}
	String toStr() {
		return "name="+name+",hp="+hp;		
	}
}
public class AvengerTest1 {

	public static void main(String[] args) {
		Avenger thor = new Avenger("토르", 150);
		Avenger thanos = new Avenger("타노스", 1000);
		System.out.println("thor.toStr()="+thor.toStr());
		System.out.println("thanos.toStr()="+thanos.toStr());
		System.out.println("punch 호출후!!==========================");
		thor.punch(thanos); // void 함수 호출!!
		System.out.println("thor.toStr()="+thor.toStr());
		System.out.println("thanos.toStr()="+thanos.toStr());
		
		System.out.println("thanos.punch 호출=======================");
		thanos.punch(thor); // void 함수 호출!!
		System.out.println("thanos.toStr()="+thanos.toStr());
		System.out.println("thor.toStr()="+thor.toStr());	
	}
}
