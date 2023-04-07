package ch12_1; // 다중 예외 처리

import java.util.InputMismatchException;
import java.util.Scanner; // 자바 APT, Scanner 불러오기.

public class ExceptionEx3 {

	public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in); //Scanner 객체 생성.
		System.out.println("숫자 입력 : ");
	
		try {
			int inputNum = input.nextInt();  // 입력 문자열을 정수로 변환 
			System.out.println("inputNum = " + inputNum);
			int result = 10 / inputNum;
			System.out.println("result = " + result);
			System.out.println("input.close() 완료");
		} catch (InputMismatchException e) { //숫자 형식이 잘못된 경우 발생될 예외
			System.out.println("숫자 입력하라는데 말 안들음");
		}
		  catch (ArithmeticException e) { // 산술 연산이 잘못된 경우 발생될 예외
			  System.out.println("정수를 0으로 나눔.");
		  }
		  finally {
			input.close();
			System.out.println("프로그램 정상 종료!!");	
		}
	}
}
