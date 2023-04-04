package ch09_ex;

import java.util.Random; // API 불러오기.-Random API

public class RandomTest {

	public static void main(String[] args) {
		Random random = new Random(); // Random 객체 생성
		int n = 10;
		
		System.out.printf("임의의 정수: %d\n", random.nextInt()); // 임의의 정숫값 반
		System.out.printf("0이상 N(%d) 미만의 임의 정수: %d\n" ,n,
							random.nextInt(n)); //0이상 n미만의 임의 정수 생성
		System.out.printf("임의의 실수: %f\n", random.nextDouble()); // 임의의 실숫값 반환
		System.out.printf("임의의 참/거진: %b\n", random.nextBoolean()); // 임의의 참/거짓 반
	}
}
