package ex08_4;

class MyMath {
	int num;
	static int snum;
	void increase() {
		num++;
		System.out.println("num="+num);
		System.out.println("snum="+snum); //sum이 공유변수(static)라 출력 가능
		
	}
	static void max(double a, double b) {
		double result = (a>b)?a:b; // 조건 / 조건이 참일 때는 a 출력, 거짓일 때는 b 출력.
		System.out.println("result="+result);
		//System.out.println("num="+num); -> static 메서드에서는 인스턴스 변수 사용 불가하다!!!
		System.out.println("snum="+snum); //-> static 메서드에서 static 변수 사용 가능
	}
	
}

public class MyMathTest {

	public static void main(String[] args) {
		// static 메서드, static 변수는 객체 생성 없이 사용 가능하다.
		MyMath.max(154, 180);
		System.out.println("MyMath.snum="+MyMath.snum);
		
		
		MyMath m1 = new MyMath();
		m1.num=100;
		
		MyMath m2 = new MyMath();
		m2.num=200;
		
		m1.increase();
		m2.increase();

		m2.max(22,34);
		m2.max(88,77);
		
		MyMath.max(44,55); // static붙어서 MyMath.max 가능, MyMath.increase는 안된다.
		
	}

}
