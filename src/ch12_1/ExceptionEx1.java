package ch12_1;

public class ExceptionEx1 {

	public static void main(String[] args) {
		String [] names = {"Kim","Lee","Park","Choi"};
		//여기서 에러남
		//에러나는 순간 프로그램은 비정상 종료
		//앱사용하다가 갑자기 비정상 종료!!
		System.out.println(names[4]);
		
		System.out.println("이건 실행 안됨!!!");
	}
}