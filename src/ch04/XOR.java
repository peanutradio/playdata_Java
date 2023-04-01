package ch04;

public class XOR {

	public static void main(String[] args) {
		/*
		 * 파이썬 3 ^ 2 => 9 (3의 2승) 
		 * 파이썬 ^ 는 승을 계산
		 * 
		 * 자바의 ^ 는 XOR 연산자이다(파이썬과의 차이점!)
		 *XOR 연산자는 두개가 같으면 false, 두개가 다르면 true
		 * 자바는 true는 1, false 0
		 * 정수일때는 각 비트별로XOR 연산된 후 결과가 10진수로 변
		 */
		// XOR 연산 
		int a = 3^2;
		/* 
		 * 3 => 이진수로는 11
		 * 2 => 이진수로는 10
		 * XOR => 01 -> 1(첫째자리 같이서 false 0 / 둘째자리 달라서 true 1 ) 
		 * 
		 */
		System.out.println("a = "+a);
		
		int b = 3^3;
		/*
		 * 3 (이진수) => 11
		 * 3 (이진수) => 11
		 * XOR      => 00(첫째자리, 둘째자리  같아서 0/false)		
		 *  */
		System.out.println("b = "+b);
		
		//100단위 XOR
		/* 100(이진수) => 0 1 1 0 0 1 0 0
		/* 200(이진수) => 1 1 0 0 1 0 0 0
		 * XOR       => 1 0 1 0 1 1 0 0 => 172 (십진수)
		 * 
		 */
		System.out.println("100^200 = "+(100^200));
		
		
		boolean c = (true^false);
		System.out.println("c=" +c);
		
		boolean d = (true^true);
		System.out.println("d=" +d);	
		
		
		// 자바의 3의 2승 ==> Math.pow
		double p = Math.pow(3,  2);
		System.out.println("p = "+p);
	}
}
