package ch07; // Dog class

public class Dog {
	
	String name;
	String breeds;
	int age;
	
	void wag() {
		System.out.println(name  + ":" + " 살랑살랑~~!!");
	}
	
	void bark() {
		System.out.println(name  + ":" + " 멍멍~!!");
	}
	//자바는 같은 이름의 함수 중복 선언 불가
//	void bark() {
//		System.out.println(name  + " 멍멍~!!");
//	}
	/*
	 *  하나의 클라스에서 매개변수타입, 매개변수 타입과 개수, 매개변수 개수
	 *  가 다르게 같은 이름의 함수들 여러개 선언 가능
	 */
	void bark(int times) {
		String sound = "컹컹";
		System.out.println(name + ":" + sound + "x" +times);
		}
}

