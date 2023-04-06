package ch11_2; //인터페이스-추상클래스.

abstract class Alarm {
	abstract void beep();
	abstract void musicPlay ();
}

abstract class Phone {
	abstract void call();
	abstract void message();
}	
	
class TV extends Alarm {
	void beep() {System.out.println("아침 7시 TV 켜짐");}
	void musicPlay() {System.out.println("LG 오브제 음악 연주");}
}

class Telephone extends Phone {
	void call() {System.out.println("집 전화 걸기");}
	void message() {System.out.println("집 전화 문자 보내기");}

}
// 두개 이상의 추상클래스 혹은 일반 클래스 아무튼 클래스 상속 불가!!
class Smartphone extends Alarm, Phone {
	void call() {System.out.println("집 전화 걸기");}
	void message() {System.out.println("집 전화 문자 보내기");}





public class AbstractTest {

	}