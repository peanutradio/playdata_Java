package ch08_mvc;

import java.util.Scanner;

public class CalculatorView {
	// 첫번재 정수	
	public int su1;
	// 두번재 정수
	public int su2;
	// 연산자 (+, -, *, /)
	public String operator;
	
	//사용자의 입력을 받는 함수
	public void input() {
		// 사용자 입력을 받는 객체
		Scanner sc = new Scanner(System.in);
		System.out.println("***********************************");
		System.out.print("연산자 : ");
		// 문자열을 1줄 읽어 들임.
		operator = sc.nextLine();
		System.out.print("숫자1 : ");
		// 정수를 입력 받아서 su1에 저장.
		su1 = sc.nextInt();
		System.out.print("숫자2 : ");
		// 정수를 입력받아서 su2에 저장.
		su2 = sc.nextInt();
		System.out.println("***********************************");
		
	}
	// 실행 결과를 출력하는 함수
	// 매개변수 result: 계산 결과.
	public void display(int result) {
		System.out.println("***********************************");
		System.out.printf("계산 결과 : %d\n, result");
		System.out.println("***********************************");
	}
}
