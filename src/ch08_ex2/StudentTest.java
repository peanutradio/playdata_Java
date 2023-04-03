package ch08_ex2; // static 변수

public class StudentTest {

	public static void main(String[] args) {
		Student park = new Student(2019122104, "Park");
		Student kim = new Student(2019206028, "Kim");
		Student lee = new Student(2019153237, "Lee");
		System.out.printf("Student 객체의 수 : %d", Student.count);
	}
}

class Student {
	// 클래스 변수(static 필드)-> 공유
	static int count = 0;


	//인스턴스 변수(non-static 필드) -> 비공유
	int id;
	String name;
	
	//생성자(constructor)
	Student(int _id, String _name){
		Student.count++;  // 클래스 변수를 1만큼 증가
		id = _id;
		name = _name;
	}
}