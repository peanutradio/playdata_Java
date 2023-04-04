package ch10_ex7;

class Car{
	String name;
	Car(String n1){
		System.out.println("=======================");
		System.out.println("Car() 생성자 실행!!");
		System.out.println("n1="+n1);		
		name=n1;
		System.out.println("=======================");
	}
}
class Truck extends Car{
	double payload;
	// 1) 자식 클래스 생성자는 부모 클래스 생성자 호출 / super(매개 변수값)
	// 2) 안하면 Java가 자동으로 super() 추가한다.
	//       --> 오류나는 이유는'매개변수가 안맞아서(Car(String n)' 이다. 
	Truck(String n, double p){
		//super("몰라");
		super(n);
		System.out.println("=======================");
		System.out.println("Truck() 생성자 실행!!");
		System.out.println("n="+n+",p="+p);
		payload=p;
		System.out.println("=======================");
	}
}
public class CarTest1 {
	public static void main(String[] args) {
		Truck t = new Truck("봉고", 1.5);
		System.out.println("t.name="+t.name);
		System.out.println("t.payload="+t.payload);
	}
}