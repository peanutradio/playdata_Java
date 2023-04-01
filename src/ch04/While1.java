package ch04;

public class While1 {

	public static void main(String[] args) {
		int n = 1;
		
		while (n < 4) {
			System.out.println("n = "+ n);
			n= n+ 1; // == n ++;
		
		}
		System.out.println("END");

	}

}
