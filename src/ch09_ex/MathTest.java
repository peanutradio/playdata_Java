package ch09_ex;  // API 활용 

import java.lang.Math;  // -> API 불러오기-Math API

public class MathTest {

	public static void main(String[] args) {
		System.out.printf("수학의 파이(원주율) 값 : %f\n",Math.PI ); //원주율 변수 
		System.out.printf("임의 난수  : %f\n",Math.random() ); // 임의의 실숫값 반환 
		System.out.printf("9.81의 내림값 : %f\n",Math.floor(9.81) ); //실숫값 내림처리 
		System.out.printf("4의 제곱 : %f\n",Math.sqrt(4) ); // 제곱근 구하기 
		System.out.printf("2의 3승 : %f\n",Math.pow(2,3) ); //2의 3 제곱 계산 
	}
}
