package ex08_6;

import java.util.Scanner;

class Account{
	String password; //비번
	long balance; //잔액
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
		Account acc = new Account();
		acc.password="1234";
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
		/*인스턴스 변수 수정!!!*/
		acc.balance = m * 5;
		acc.password = p;
		System.out.println("입력값 사용 출금===============");
		acc.withdraw(p, m);		
	}
}