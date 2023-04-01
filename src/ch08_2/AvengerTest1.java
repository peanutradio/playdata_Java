package ch08_2; // 레퍼런스 함수 공유 2

class Avenger {
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
		System.out.println("==================================");
		
		Avenger enemy = thanos;
		enemy.hp -= 10;
		System.out.println("thor.toStr()="+thor.toStr());
		System.out.println("thanos.toStr()="+thanos.toStr());
		System.out.println("enemy.toStr()="+enemy.toStr());
	}
}
