package ex08_7;

import java.util.Scanner;

class Account{
	//private 라서 다른 클래스에서 값 조회, 값 설정 불가!!
	private String password; //비번
	private long balance; //잔액
	private String ssn; //주민번호
	
	//초기값은 생성자에서 설정
	Account(String s, String p){
		ssn = s; password = p;
	}
	// 조회 가능 메서드 이용해서 잔액 조회.
	void getBalance() {
		System.out.println("잔액조회:"+balance+"원");
	}
	/*
	 * 매개변수 : inputSsn :입력 주민번호
	 *          oldPassword: 기존 통장 비번
	 *          newPassword: 새로 바꾸고 싶은 통장 비번
	 */
	void setPassword(String inputSsn, String oldPassword, String newPassword) {
		if(ssn.equals(inputSsn)) {
			
			if(password.equals(oldPassword)) {
				password = newPassword;
				System.out.println("비번 수정 완료!!");
			}else {
				System.out.println("비번 오류!!");
			}
		}else {
			System.out.println("주민번호 오류!!");
		}
	}
	//매개변수:inputMoney :입금액
	void deposit(long inputMoney) { //입금
		balance+=inputMoney;
	}
	//매개변수 inputPassword(입력비번), outMoney(출금액)
	void withdraw(String inputPassword, long outMoney) { //출금
		//문자열 비교는 고민하지말고 equals 사용하자
		//if (password==inputPassword) {
		if (password.equals(inputPassword)) {
			if(balance>=outMoney) {
				balance-=outMoney;
				System.out.println(outMoney+"원 출금 완료");
				System.out.println("현재 잔액 "+ balance+"원");
			}else {
				System.out.println("잔액부족");
			}
		}else {
			System.out.println("비밀번호 불일치!!");
		}
	}
}
public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account("230101-312345", "1234");
		
		//acc.balance = 10000000000; -> 에러!!
		//acc.password="1234";
		//20억 입금
		acc.deposit(2000000000);
		/*
		 * 20억 입금 해놓고 50억 출금 하려면?
		 * 비번 0070으로 80억 출금 하려면?
		 * 
		 * 인스턴스 변수 수정 하면됨!!!!
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("비번입력");
		String p = sc.nextLine();
		System.out.println("출금액입력:");
		long m = sc.nextLong();
		/*인스턴스 변수 수정 불가 왜? private!!*/
		//acc.balance = m * 5;
		//acc.password = p;
		System.out.println("입력값 사용 출금===============");
		acc.withdraw(p, m);	
		System.out.println("===========잔액 조회============");
		acc.getBalance();
		System.out.println("===========비번 수정============");
		acc.setPassword("230101-312345", "1234", "0070");
	}
}
