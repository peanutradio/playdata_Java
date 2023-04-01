package ch08; // 객체 레퍼런스 공유

class Dog {
	String name; int age;
	
	Dog(String n, int a) {
		name=n;
		age = a;
	}
	String toStr() {
		return "name = " + name+", age= "+age	;
	}
}

public class DogTest1 {

	public static void main(String[] args) {
		Dog d1 = new Dog("망고", 2);
		Dog puppy = d1 ;  // 레퍼런스 공유
		puppy .age = 500;
		System.out.println("d1.toStr():"+d1.toStr());
		System.out.println("puppy.toStr():"+puppy.toStr());
		
	}

}
