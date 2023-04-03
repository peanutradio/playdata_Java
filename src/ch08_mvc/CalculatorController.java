package ch08_mvc;

public class CalculatorController {

	public static void main(String[] args) {
		// 사용자의 입력을 받고 결과를 출력하는 view 객체
		CalculatorView view = new CalculatorView();
		// 업무를 처리하는 Model 객체
		CalculatorModel model = new CalculatorModel();
		// 사용자의 입력을 받음
		view.input();

		int result = 0;
		try {
			// view.su1 : 사용자 입력 정수1
			// view.su2 : 사용자 입력 정수2
			// view.operator : 연산자.

			// 입력정수 1 입력정수 2 연산자를 이용해서 계산 후 결과 리턴
			result = model.calc(view.su1, view.su2, view.operator);
			// 실행 결과 출력
			view.display(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

