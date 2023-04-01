package ch06; 

public class ArrayToParameter { // 메서드로 배열 잔달하기

	public static void main(String[] args) {
		int[] evens = {0,2,4,6,8,10,12,14,16,18}; // 짝수 배열
		int[] primes = {2,3,5,7,11,13,17,19}; // 소수 배열
		
		int evenSum = sum(evens); //레퍼런스 변수 evens 전달
		int primeSum = sum(primes); //레퍼런스 변수 primes 잔달
		
		System.out.printf("짝수 배열의 합: %d\n", evenSum);
		System.out.printf("소수 배열의 합: %d\n", primeSum);
	}

	//=========================================================//
	public static int sum(int[] arr) { // 배열을 가리킬 입력변수 arr
		int sum = 0;
		for (int i=0; i<arr.length; i++ ) {  // 배열의 모든 인덱스를 순
			sum += arr[i];   // 누적합 계산
		}
		return sum;
	}
}
