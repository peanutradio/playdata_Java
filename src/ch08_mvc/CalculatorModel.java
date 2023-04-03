package ch08_mvc;

public class CalculatorModel {
	// 입력 받은 연산자에 따라 적절한 연산 실행
	/* 매개변
	 * su1: 숫자1
	 * su2: 숫자2
	 * operator: 연산자
	 */
public int calc(int su1, int su2, String operator) throws Exception {
	// 연산자가 + 일때
	if(operator.equals("+"))
		// 정수의 합 리턴
		return su1+ su2;
	// 연산자가 - 일때
	if(operator.equals("-"))
		// 정수의 차 리턴
		return su1 - su2;
	// 연산자가 * 일때
	if(operator.equals("*"))
		// 정수의 곱 리턴
		return su1 * su2;
	// 연산자가 / 일때
	if(operator.equals("/"))
		// 정수의 나누기 한 몫 리턴
		return su1 / su2;
	// 일치하는 연산자가 없을때,
	else
		throw new Exception( "잘못된 연산자 입니다.");
}

}
