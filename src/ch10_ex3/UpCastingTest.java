package ch10_ex3; // 업캐스팅 실습 

public class UpCastingTest {

	public static void main(String[] args) {
		Square s = new Square();
		s.name = "정사각형";
		Triangle t = new Triangle();
		t.name = "삼각형";
		Circle c = new Circle();
		c.name = "원";
		
		Shape[] shapes = {s,t,c}; //부모의 타입으로 업 캐스팅 배열 생성.
		for (int  i=0; i<shapes.length; i++) {
			System.out.printf("%d번 인덱스의 도형: %s\n", i, shapes[i].name);
		}
	}
}

// 부모 클래스
class Shape { // 도형.
	String name;
}

// 자식 클래스
class Square extends Shape{} // 정사각
class Triangle extends Shape{} // 삼각형
class Circle extends Shape{} // 원