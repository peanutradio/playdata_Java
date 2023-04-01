package ch08;

public class Cat {

	String name;
	String breeds;
	double weight;
	
	Cat(String n, String b, double w){ 
		System.out.println("생성자 시작!!!");
		System.out.printf("n = %s, b = %s, w = %f\n ",n,b,w );
		
		name = n;
		breeds = b;
		weight = w;
		System.out.println("생성자 !!!");
		System.out.println("===============================");
	}
	
	void claw() {
		System.out.println("할퀴기~샤악~!!");
	}
	
	void meow( ) {
		System.out.println("야옹~야용~!!");
	}
}
