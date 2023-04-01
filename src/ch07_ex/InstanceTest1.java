package ch07_ex;

public class InstanceTest1 {

	public static void main(String[] args) {

		Cat c = new Cat();

		c.name = "Yolo";
		c.breeds = "perishan";
		c.weight = 4.37;

		System.out.printf("이름 : %s\n", c.name);
		System.out.printf("품종 : %s\n", c.breeds);
		System.out.printf("무게 : %.2fkg\n", c.weight);

		Dog d1 = new Dog();
		Dog d2 = new Dog();

		d1.name = "Mango";
		d1.breeds = "Golden litriver";
		d1.age = 2;

		d2.name = "GGami";
		d2.breeds = "mixed";
		d2.age = 3;

		System.out.printf("d1 => {%s, %s, %d세}\n", d1.name, d1.breeds, d1.age);
		System.out.printf("d2 => {%s, %s, %d세}\n", d2.name, d2.breeds, d2.age);

		d1.wag();
		d2.bark();
		d1.bark(3);

	}

}
