package ch12_1;

public class ExceptionEx2 {

	public static void main(String[] args) {
		String [] names = {"Kim","Lee","Park","Choi"}; // 배열 생성.
		// 실행 중에 에러가 나지만 프로그램은 비정상 종료는 안되게 하고 싶다.
		
		for (int i=-1; i<6; i++) {
			try {
				System.out.println("==========================");
				System.out.println("names["+i+"] 출력할꺼임!");
				System.out.println(names[i]);
				System.out.println("names["+i+"] 출력 완료! - 에러 안날 때 실행!"); // 예외 발생.
				} catch(ArrayIndexOutOfBoundsException e) { // 예외 처리 대상 타입.
					System.out.println("i="+i+"에서 에러남!!");
				} finally { // 예외 발생과 상관 없이 finally 문 수행.
					System.out.println("names["+i+"] 출력 완료! - 에러가 나건 말건 항상 실행!");
				}
		} //end for
		System.out.println("프로그램 잘 종료!!");
	} //end main
} // end class 