package ch08; // 생성자 만들기 

public class HeroTest1 { //Hero Test 클래

	public static void main(String[] args) {
		// 생성자 호출, 두 Hero 객체 만들기
		Hero ironMan = new Hero("아이언맨", 100, 120);  // 생성자 호츨 
		Hero hulk = new Hero("헐크", 200, 80);
		
		// 객체 정보 출력
		System.out.println(ironMan.toStr()); // 객체 정보 문자열로 반환.
		System.out.println("================================");
		System.out.println(hulk.toStr());

	}

}
