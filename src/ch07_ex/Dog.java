package ch07_ex;

public class Dog {

	String name;
	String breeds;
	int age;

	void wag() {
		System.out.printf("[%s] 살랑살랑~\n", name);
	}

	void bark() {
		System.out.printf("[%s] 멍멍~!\n", breeds);
	}

	void bark(int times) {
		String sound = "컹컹컹~!";
		System.out.printf("[%s] %s(x%d)\n", name, sound, times);
	}

}
