package ch04;

public class For3 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <=10; i++){
				System.out.print(i);
				sum += i;
					if (i==10) {
						break;
					}
				System.out.print("+");
	}
		
		System.out.printf("\n총합 " +"= "+ sum); // %d == sum
}
}

