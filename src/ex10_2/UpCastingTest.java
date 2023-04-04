package ex10_2; // 상속과 업캐스팅: '부모 타입 배열'에 자식 객체 담기.

class Shape {
	String name;
}
class Square extends Shape {
	int width; int height;
	
}
class Circle extends Shape {
	int radius; 
}

public class UpCastingTest {

	public static void main(String[] args) {
		Square s = new Square();  //Square 객체 생성.
		s.name = "난 Square 객체 정사각형!!";
		s.height = 100; s.width = 200;
		System.out.println("s.name="+s.name+",s.height="+s.height+",s.width="+s.width);
		
		Circle c = new Circle();
		c.name = "난 Circle 객체 원!!";
		c.radius = 50;
		System.out.println("c.name="+ c.name+",c.radius="+c.radius);
		
		Shape s1 = new Shape();
		s1.name = "난 Shape의 객체 s1이다!!";
		//=============================================================
		//Shape 타입 배열은 shape 객체, Square 객체, Circle 객체 저장 가능.
		Shape[] sa = {s, c, s1};
		//Circle [] ca = {s,c, s1} // 자녀 객체이기 때문에 같은 자녀인 s에서 error 난다.
		for (int i=0; i<sa.length; i++) {
			System.out.println("============================");
			System.out.println("sap["+i+"]="+sa[i]);
			System.out.println("sap["+i+"].name="+sa[i].name);
			
			// Circle의 radius, Square의 Height, width업캐스팅한 sa 배열에서 출력할 수 있나?
//			// 못함!!
			// 실제로 sa[i]가 Circle, Square, Triangle을 참조하지만 배열 타입이 Shape이라
			// Shape에 정의된 속성 메서드만 사용 가능하다.!!!
//			System.out.println(sa[i].radius);
//			System.out.println(sa[i].height);
//			System.out.println(sa[i].width);
			System.out.println("============================");
		}
	}

}
