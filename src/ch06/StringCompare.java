package ch06;

import java.util.Scanner;
public class StringCompare {

	public static void main(String[] args) {
		/*
		 * 기본 변수(숫자) 같은지 비교는 -> ==
		 * 레퍼런스 변수(문자) 같은지 비교는 -> equals
		 * String은 레퍼런스 변수라 같은지 비교는 equals로 해야함!!!!
		 */
		String greet="Hello";
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Hello 라고 입력해 보세요");
		String inputHello=input.next();
		System.out.println("inputHello="+inputHello);
		System.out.println("greet==inputHello:"+(greet==inputHello));
		System.out.println("greet.equals(inputHello): "+ greet.equals(inputHello));
		
		input.close();
	}
}