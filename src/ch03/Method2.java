package ch03;

public class Method2 {

	public static void printHello(String msg) {
		System.out.println("Hello" + msg);
		//return; -> 생략 가능 
	}
	public static void main(String[] args) {
		printHello("야옹");
		/*
		 * 파이썬에서는 다음과 같을 때, printHello() 함수 리턴값이 없어서
		 * 변수에 None 저장.
		 * result = printHello("야옹이);
		 * 
		 * 자바는 컴파일 에러.
		 * printHello() 함수 리턴값이 없는
		 * 변수에 result 에 리턴값 저장하려고 하면 에러 
		 * result = printHello("야옹이");
		 */
		//Object result = printHello("야옹"); -> 에러!!

	}

}
