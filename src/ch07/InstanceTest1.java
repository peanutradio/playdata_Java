package ch07; // 객체 생성.

public class InstanceTest1 {

	public static void main(String[] args) {
		// cat 객체 생생
		Cat c = new Cat();

		// 객체 상태(필드) 변경
		c.name = "네로";
		c.breeds = "페르시안";
		c.weight = 4.37;
		System.out.println("===========================");

		// 객체 상태(필드) 출력
		System.out.printf("이름: %s\n", c.name);
		System.out.printf("품종: %s\n", c.breeds);
		System.out.printf("체중: %.2fkg\n", c.weight);

		c.claw();
		c.meow();

		// Dog 객체 생성.
		Dog d1 = new Dog();
		Dog d2 = new Dog();

		// d1 객체의 상태 변경
		d1.name = "망고";
		d1.breeds = "골든리트리버";
		d1.age = 2;

		// d2 객체의 상태 변경
		d2.name = "까미";
		d2.breeds = "믹스";
		d2.age = 3;
		System.out.println("===========================");

		// 객체 상태(필드) 출력
		System.out.println("d1.name = " + d1.name);
		System.out.println("d1 breeds = " + d1.breeds);
		System.out.println("d1.age = " + d1.age);

		d1.wag();
		d1.bark();

		System.out.println("===========================");
		System.out.println("d2.name = " + d2.name);
		System.out.println("d2 breeds = " + d2.breeds);
		System.out.println("d2.age = " + d2.age);

		d2.wag();
		d2.bark();

		System.out.println("===========================");

		d1.wag();
		d2.bark();
		d1.bark(3);
	}

}
