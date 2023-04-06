package ch11_3; //인터페이스-추상클래스.

interface Alarm {
	abstract void beep();
	abstract void musicPlay ();
}

interface Phone {
	abstract void call();
	abstract void message();
}	
	
class TV implements Alarm {
	public void beep() {System.out.println("아침 7시 TV 켜짐");}
	public void musicPlay() {System.out.println("LG 오브제 음악 연주");}
}

class Telephone implements Phone {
	public void call() {System.out.println("집 전화 걸기");}
	public void message() {System.out.println("집 전화 문자 보내기");}

}
// 인터페이스는 2개 이상 상속 가능하다. // 
class Smartphone implements Alarm, Phone {
	public void beep() {System.out.println("스마트폰 알람 켜짐");}
	public void musicPlay() {System.out.println("스마트폰 음악 연주");}
	public void call() {System.out.println("스마트폰 메세지 전송");}
	public void message() {System.out.println("스마트폰 메세지 전송");}
}

public class AbstractTest {

	}