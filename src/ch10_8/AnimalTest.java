package ch10_8; // 추상 클래스 

abstract class Animal {
	String name;
//	void cry() {
//		System.out.println("지금은 미정");
//	}
	abstract void cry() ;
}

class Cat extends Animal {
	void cry() {
		System.out.println("Cat: name = "+name+" 야옹");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("Dog: name = "+name+" 멍");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		Cat c  = new Cat();
		c.name = "Garfeild";
		Dog d = new Dog() ;
		d.name = "Snoopy";

		Animal ar[] = {c, d	};
		for (int i=0; i<ar.length; i++) {
			System.out.println("=========================");
			System.out.println("ar["+i+"].cry()");
			ar[i].cry();
			System.out.println("=========================");
		} //end for
	}// end main
} //end class
