package ch03;

public class Method1 {

	public static void main(String[] args) {
		//호출 1번에 매개변수 타입 개수 일치하는 메서드 1개 실행.
		System.out.println("square(4) 호출!!");
		int m = square(4);
		System.out.println("m=" + m);
		System.out.println("=========================");
		
		System.out.println("square(3.14) 호출!!!");
		double n = square(3.14);
		System.out.println("n=" + n);
		System.out.println("=========================");
		
		System.out.println("square(10, 20) 호출");
		int o = square(10, 20);
		System.out.println("o="+ o);
		System.out.println("=========================");
		System.out.println(Math.PI);
		
		// Math.random() 0 이상 1미만 난수 리턴 
		double x = Math.random();
		System.out.println("x = "+ x);

		// Math.random() * 6 : 0 이상 5.9999999 이 난수 리턴 
		System.out.println("x*6 = "+ (x*6));

		//(int) Math.random() *6 : 0 이상 5 이하 정수, 난수 리
		int temp = (int) (x * 6);
		System.out.println("temp = "+ temp);
		
		//( (int) Math.random() *6 ) + 1 : 1 이상 6 이하 정수, 난수 리턴 (주사위)
		System.out.println("temp + 1 = "+ (temp + 1));
		
		
	}
	
	public static int square(int length) {
		System.out.println("one int square!!");
		System.out.println("length="+ length);
		return length * length;
	}
	/* 같은 이름 함수 중복 구현 불가
	public static int square(int length) {
		System.out.println("length="+ length);
		return length * length;
	}
	*/
	//매개변수 타입 다를때 중복 구현 가능
	public static double square(double length) {
		System.out.println("double square!!");
		System.out.println("length="+ length);
		return length * length;
	}
	//매개변수 개수 다를때 중복 가능
	public static int square(int length1, int length2) {
		System.out.println("two int square!!!");
		return length1 * length2;
	
	}
}