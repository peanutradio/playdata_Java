package ch06;

public class Calculator { // 정수와 실수 타입 변경 계

	public static void main(String[] args) {
		/*
		 * 자바에서 정수 타입 변수끼리 연산 결과는 무조건 정수!!
		 * ( 정수끼리의 연산은 무조건 정수 / 실수로 나오지 않는다 )
		 */
		int a = 3;
		int b = 2;
		System.out.println(a/b); // 1.5 아님!! 1이다.
		
		
		double c = a/b;
		System.out.println("c = "+c); //c = 1.0 -> double이니 실수로 나온다.
        
		/* 
		 * 정수를 실수로 바꾸는 방법
		 * (double) a
		 */
		
		//정수앞 (double)로 실수로 변함
		System.out.println("(double)a = "+ (double)a); // 실수로 변해서 3.0
		
		//정수앞 (double)로 실수로 변함
		double d = (double)a / (double)b;
		System.out.println("d= "+d);
	}

}
