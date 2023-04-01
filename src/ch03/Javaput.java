package ch03;

import java.util.Scanner;
public class Javaput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("당신의 이름: ");
		String name = input.next();
		System.out.println("name = "+ name);
		
	    System.out.print("연락처 : ");
	    int userMobile = input.nextInt();
	    System.out.println("userMobile = "+ userMobile);
		
		input.close();
		
		

	}

}
