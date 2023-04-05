package ch10_ex8; // 추상클래스.

public class AnimalTest {

	public static void main(String[] args) {
		Tiger t = new Tiger();
		Lion l = new Lion();
		Cat c = new Cat();
		Dog d = new Dog();
		Animal [ ] animals = {t,l,d,c}; //Animal 타입 배열로 업캐스팅
		for (int i=0; i< animals.length; i++ ) {
			animals[i].cry(); //메소드 오버라이팅 수행.
		}
	}
}

abstract class Animal { // 추상 클래스 선언(abstract): 내용을 구현할 필요가 없는 함수
	String name;
	abstract void cry() ;
}
class Tiger extends Animal {
	void cry() {System.out.println("어흥!");} // 재정의된 메소드.
}
class Lion extends Animal {
	void cry() {System.out.println("크아앙!");} // 재정의된 메소드.
}
class Dog extends Animal {
	void cry() {System.out.println("멍멍!");} // 재정의된 메소드.
}
class Cat extends Animal {
	void cry() {System.out.println("야옹~!");} // 재정의된 메소
}