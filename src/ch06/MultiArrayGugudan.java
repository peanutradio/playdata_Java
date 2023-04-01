package ch06;

public class MultiArrayGugudan {

	public static void main(String[] args) {
		int[][] gugudan = new int[10][10]; // 이치원 배열의 공간 할당
		
		for (int i=1; i <=9; i++) {
			for (int j=1; j<=9; j++) {
				gugudan[i][j] = i*j; // 이차원 배열의 초기	
			}
		}
		System.out.printf("2 x 7 = %d\n", gugudan[2][7]); //[2][7] 인덱스가 가르키는 곳
		System.out.printf("8 x 8 = %d\n", gugudan[2][7]); //[9][4] 인덱스가 가르키는 곳
	}
}
