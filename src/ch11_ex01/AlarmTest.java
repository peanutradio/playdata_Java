package ch11_ex01;

public class AlarmTest {

	public static void main(String[] args) {
		Alarm a = new SmartPhone(); // 업 캐스팅 
		a.playMusic("상어송");        // 인터페이스를 통한 메소드 호출 
		a.beep();
	}
}

interface Alarm {
	void playMusic(String title);  // 추상 메소드들(중괄호가 없음)
	void beep();
}

class SmartPhone implements Alarm {
	private String phoneNumber;
	public void playMusic(String title) {
		System.out.printf("[%s]이 재생됩니다.\n", title); // 재정의된 playMusic() 메소드
	}
	public void beep()  {
		System.out.println("[비프음]이 재생됩니다. 삐빕~삐비비비!(x10)"); // 재정의 된 beep() 메소드
	}
	
	
}