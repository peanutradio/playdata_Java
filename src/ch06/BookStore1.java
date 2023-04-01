package ch06;

import java.util.Scanner;

public class BookStore1 { //배열 이중 for 문~~~!! 이해됨!!! 와우!!!
	
	static final int NUM_BOOK = 2; //자바의 상수는 static final(상수: 값 못바꿈)
	static final int NUM_ITEM = 3; //자바의 상수는 static final(상수: 값 못바꿈)
	

	public static void main(String[] args) {
		//상수라서 값 변경 불가!!
		//NUM_BOOK=10; //에러남
		String [][] book = new String[NUM_BOOK][NUM_ITEM];
		book[0][0]="ISBN1234"; book[0][1]="JSP"; book[0][2]="27000";
		book[1][0]="ISBN1235"; book[1][1]="안드로이드"; book[1][2]="33000";
		
		for(int i=0; i<NUM_BOOK; i++) {
			System.out.println("i="+i);
			//반복할일이 1줄이면 { } 생략 가능!!!
			for(int j=0; j<NUM_ITEM; j++) //{
				System.out.println("book["+i+"]["+j+"]="+book[i][j]);
			//}
			System.out.println("===========================");
		}
		Scanner input = new Scanner(System.in);
//		System.out.println("안녕 반가워 또만나 입력");
//		//입력버퍼가 비었으면 입력할때까지 기다렸다가 단어 1개를 System.in에서 꺼냄
//		String str = input.next();// 처음만 선언->이후 그냥 갖다 쓰기!
//		System.out.println("str="+str);
//		
//		//입력버퍼에 있는 단어들 다 꺼내서 텅텅 비게
//		//입력버퍼에 뭐가 있으면 안기다리고 입력버퍼에에 있는 단어들 꺼냄
//		input.nextLine();
//		
//		System.out.println("안녕 반가워 또만나입력");
//		//입력버퍼에 뭐가 있으니까 안기다리고 입력버퍼에에 있는 단어들 꺼냄
//		str = input.nextLine();
//		System.out.println("str="+str);
//		
		System.out.println("장바구니 담을 ISBN 입력!!!");
		String str = input.nextLine();
		//배열 book에 str과 일치하는 isbn 있으면 true로 바꿀꺼임.
		boolean flag = false;
		// 배열 book에서 str과 일치하는 isbn의 인덱스 저장할꺼임.
		int numId = -1;
		
		for (int i=0; i<NUM_BOOK; i++) {
			System.out.println("==============================");
			System.out.println("book["+i+"][0]="+book[i][0]);
			System.out.println("str = "+str);
			
			// 기본 타입은 같은지 == 비교
			// 래퍼런스 타입은 같은지 equals로 비교 못
			//if(str==book[i][0]) {
			if(str.equals(book[i][0])) {		
				System.out.println("str과 book[i][0] 같음! 찾았음!!!");
				numId = i;
				flag=true;
				System.out.println("flag="+flag);
				System.out.println("numId="+numId);
				System.out.println("==============================");			
				break;
			} //end if
			System.out.println("==============================");			
		} //end for
		System.out.println("flag="+flag);
		System.out.println("numId="+numId);
		    //if (flag==true) { ->true 생략 가능.
			if (flag) {
				System.out.println("찾기 그만!! Quit변수에 true에 대압할 것임!!");
				System.out.println("장바구니에 추가하겠습니까? Y 또는 N");
				// 입력값 Y 또는 N을 str 에 저
				str = input.nextLine();
				System.out.println("str = "+str);
				// 대문자는 그대로, 소문자는 대문자로 바꿔서 리턴.
				str = str.toUpperCase();
				System.out.println("str.toUpperCase() 한 후 = "+str);
				// 문자열을 == 비교못함, equals로 비교해야 함!!!
				if(str.equals("Y")) { //대소문자도 같아야 
					System.out.println("장바구니에 추가합니다!");		
				}
		    }else {
				System.out.println("다시입력!!!");
		}
	} //end main
} //end class


