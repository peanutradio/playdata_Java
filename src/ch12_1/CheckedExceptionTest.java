package ch12_1;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		for (int i=0; i<100; i++) {
			System.out.println("i = "+i);
		try {	// 프로그램 500 밀리섹크 멈춤
			Thread.sleep(500);
		}catch(InterruptedException e) {
			System.out.println("잠깐 멈춰있고 반복문 안끝났는데 중간에 누가 날 강제종료!!");
		}

	}
	}
}
