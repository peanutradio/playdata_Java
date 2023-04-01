package ch04;

public class Grade {

	public static void main(String[] args) {
		printGrade(85);
	}

	public static void printGrade(int score) { 
		//if-else 조건
		char grade;
		if (score >= 90) { 
			grade = 'A' ; 
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'F';
		}
		System.out.printf("점수: %d, 학점: %c\n", score, grade);
		
		// switch 조건
		switch (grade) {
			case 'A': 
				System.out.println("장학금 100만");
				break;
			case 'B': 
				System.out.println("백화점 상품권 50만");
				break;
			case 'C': 
				System.out.println("도시상품권 30만");
				break;
			default:
				System.out.println("교수님 격려 ");				
		}
		// 삼항 연산
		int n = 11;
		String result = (n % 2==0) ?  "짝수": "홀수 ";
		System.out.println("result=" + result); // 결과는 '홀수'
	
	}
}
