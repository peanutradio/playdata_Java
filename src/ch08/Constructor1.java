package ch08;

public class Constructor1 {

	public static void main(String[] args) {
		Cat c = new Cat("네로", "페르시안", 3.78);
		System.out.println("c.name="+c.name);
		System.out.println("c.breeds="+c.breeds);
		System.out.println("c.weight="+c.weight);
		
		c.claw();
		c.meow();
		
		
		System.out.println("c="+ c);
	}

}
