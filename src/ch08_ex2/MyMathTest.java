package ch08_ex2; //static 메서드

public class MyMathTest {

	public static void main(String[] args) {
		System.out.println(MyMath.max(1.23, 3.45));
		System.out.println(MyMath.min(5.43, 3.21));
	}
}

class MyMath {
	static double max(double a, double b) { 
		return (a>b)?a:b;
	
	}
	static double min(double a, double b) {
		return(a<b)? a:b;
	}
}