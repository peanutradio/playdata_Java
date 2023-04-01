package ch08_3; //static 키워드-> static은 공유하겠다는 

class  Student { 
	static int count; // 공유할 것이다.
	int id; // 공유 안한다.
	String name;	// 공유 안한다.
	String toStr() { return "count="+ count+", id="+id+", name="+name;}

}
	
public class StudentTest1 {

	public static void main(String[] args) {
		Student park = new Student(); //student 객체를 만들고-> 그 안에 park의 id, name을 불러온다.
		park.id=100; park.name = "박찬호";
		
		Student kim = new Student();
		kim.id=100; kim.name = "김건희"; //student 객체를 만들고-> 그 안에 kim의 id, name을 불러온다.
		System.out.println("park.toStr()="+park.toStr());
		System.out.println("kim.toStr()="+kim.toStr());
		
		System.out.println("kim.id를 1004로 수정");
		kim.id=1004; // kim 여사의 아이디를 1004 로 변

		System.out.println("park.toStr()="+park.toStr());
		System.out.println("kim.toStr()="+kim.toStr()); //다시 출력하면 kim id만 변경됨.

		kim.count = 10000; //kim의 count를 10000으로 변
		System.out.println("park.toStr()="+park.toStr());
		System.out.println("kim.toStr()="+kim.toStr()); 
		// 이번에는 kim,park의 카운트 모두 변경됨.why?-> 비밀은 static(공유)이다.
		/* static 없는 변수는 Instance 변수
		 * static 붙은 변수 변수는 static 변수(or class변수)라고 한다.
		 */
		System.out.println("Student.count를 20000으로 수정");
		Student.count=20000; //class명 변수 변경해도 static이 붙으면 값이 변경된다.	 
		System.out.println("park.toStr()="+park.toStr());
		System.out.println("kim.toStr()="+kim.toStr()); 
		
		
	}

}
