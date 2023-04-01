package ch04;

public class Continue1 {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
	
			if(i%3==0) {
				System.out.println("3의 배수!");
				System.out.println("@@@@@@@@@@@@@@@@@@@@2");
				continue;		
			}
			
			System.out.println("i = "+i);
			System.out.println("====================");
		}
	}
}
