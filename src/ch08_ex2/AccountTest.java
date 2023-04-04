package ch08_ex2;  // 접근제어자

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.setBalance(10000);
		System.out.printf("잔액: %d", acc.getBalance());
	}
}

class Account {
	private int balance; //잔액, private 접근제어자 적용.
		
		//getter 메소드 -> 받은 인자 값을 반환.
		public int getBalance() {
		return balance;
	}
		// setter 메소드 > 인자를 받음.
		public void setBalance(int b) {
			balance = b;
		}	
}