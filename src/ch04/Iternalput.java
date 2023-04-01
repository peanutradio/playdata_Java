package ch04;

import java.util.Scanner;

public class Iternalput {

	public static void main(String[] args) {
		boolean quit=false;
		Scanner input = new Scanner(System.in);
		
		while(!quit) { 
			System.out.print("메뉴: ");
			int n = input.nextInt();
			System.out.println("입력메뉴: "+n);
			
		}
		input.close();
	}

}
