package ex08_4; // 클래스 변수와 인스턴스 변수 범위


class Student {
	// 클래스 변수 (static 필드)
	static int count;
	// 인스턴스 변수(non-static 필드)
	int id;
	String name;
	
	// 생성자
	Student(int i, String n) {
		// 객체 생서아려면 생성자가 꼭!!! 실행 되어야함.
		// 생성자가 실행될 때마다 count 1씩 증가한다.
		//Student 객체 몇개 만들었는지를 보면 됨. count 보면 됨.
		count++; // count  값은 1씩 증
		id=i; name = n; // 불러올 객체에서 주어지는 값 출력. 
	}
	
	String toStr() {
		return "count="+count+", id="+id+", name="+name;
	}
}
public class StudentTest {

	public static void main(String[] args) {
		Student park = new Student(100, "박찬호");
		System.out.println("park.toStr()="+park.toStr());

		Student kim = new Student(1004, "김건희");
		System.out.println("kim.toStr()="+kim.toStr());
		
		System.out.println("================================");
		System.out.println("park.toStr()="+park.toStr());
		//park.toStr()=count=2, id=100, name=박찬호
		//-> kim이 count를 2로 만들어놓음.
		
		System.out.println("================================");
		System.out.println("Student 객체 몇개 만들었나?  "+ Student.count+"개");
	}
}
