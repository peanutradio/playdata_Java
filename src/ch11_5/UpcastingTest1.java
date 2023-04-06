
package ch11_5;
interface Flayable{
	public static final int WING_NUM=2; //상수 가능
	public void fly(); //public 한 추상메서드
}
interface Weapon{
	void shoot(); //무조건 public
}
class Bird implements Flayable{
	public void fly() {
		System.out.println("Bird:새가난다");
	}
}
class Helicopter implements Flayable, Weapon{
	public void fly() {
		System.out.println("Helicopter:헬리콥터 난다");
	}
	public void shoot() {System.out.println("Helicopter:헬리콥터가 사격합니다");}
}
class Gun implements Weapon{
	public void shoot() {System.out.println("Gun:총으로 목표물을 사격합니다");}
}

public class UpcastingTest1 {

	public static void main(String[] args) {
		Bird b = new Bird();
		Helicopter h = new Helicopter();
		Gun g = new Gun();
		
		Flayable [] farr= {b,h};
		for(int i=0; i<farr.length; i++) {
			System.out.println("farr["+i+"].fly()");
			farr[i].fly();
			System.out.println("====================");
		}
		Weapon []warr = {h,g};
		for(int i=0; i<warr.length;i++) {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("warr["+i+"].shoot()");
			warr[i].shoot();
		}//end for
	}//end main
}//end class