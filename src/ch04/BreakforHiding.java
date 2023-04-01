package ch04; // 분기문 만들기.

public class BreakforHiding {

	public static void main(String[] args) {
		printSum(1, 10);
	}

	// 입력 정수 start부터 end까지의 정수의 총합을 출력 
	public static void printSum(int start, int end) { 
		int sum = 0;
		for (int i = start; i <= end; i++) {
			System.out.printf("%d", i);
			sum += i;
			System.out.println(" + ");
		}
		System.out.printf(" = %d ", sum);
	}
	
	
	
}
