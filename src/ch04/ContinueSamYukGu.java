package ch04;

public class ContinueSamYukGu {

	public static void main(String[] args) {
		for (int i = 1; i<=10; i++) {
			if (i ==3 || i ==6 || i==9) {  //i가 3, 6, 9인 경우 
				System.out.printf("짝 ");  //박수 소리를 출력한 뒤 
				continue;                  //다음 반복으로 넘어감. 
				
			}
			System.out.printf("%d ", i);
		}
	}
}
