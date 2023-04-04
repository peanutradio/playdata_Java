package ch10_ex7; // 상속 객체의 생성 과정.

class AA{
	int a;
	
	AA() {
		System.out.println("AA() 생성자!!!");
		a=100;
	}
}

class BB extends AA {
	int b;
	BB() {
		// 부모클래스의 생성자 호출. / 자식 클래스 생성자 첫번째줄에 생성(반드시 첫번째줄)
		//super(매개변수 값)
		super();
		System.out.println("BB() 생성자!!");
		b=500;
	}
}

public class ConstructorWithInheritance1 {

	public static void main(String[] args) {
		BB child = new BB();
		System.out.println("child.a = "+child.a);
		System.out.println("child.b = "+child.b);

	}

}
