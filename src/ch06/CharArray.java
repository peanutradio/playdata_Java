package ch06;

public class CharArray {

	public static void main(String[] args) {
		String str = "Programming is fun!!";
		/*
		 * 파이썬에서 
		 * str1 = "Programming is fum!!"
		 * str[2] -> 이러면 파이썬에서는 o을 턴한다. 
		 * 파이썬은 문자열이 list 이다. 
		 * 
		 * 자바
		 * String str =  "Programming is fun!!; 일 때,
		 * str1[2] -> 에러!!
		 * 문자열과 배열이 다르다!!
		 */
		String str1 = "Programming is fun!!";
		// java는 문자열 str1의 배열을 바꾸고 나서 한글자씩 꺼낼 수 있음!!!
		char[] charArr = str1.toCharArray();
		System.out.println("charArr.length="+charArr.length);
		
		// '특정 알파벳'을 출력하려면, char배열에 넣어서 찾으면 된다.
		int count = 0;
		for (int i=0; i<charArr.length; i++) {
			System.out.println("charArr["+i+"]='"+charArr[i]+"'");
			if(charArr[i]=='R' || charArr[i]=='r') {
				System.out.println("R 찾음!!! count 1중가 할꺼임!!");
				count++;
			} //end if
			System.out.println("================================");		
		}//end for
		System.out.println("count = "+count);
	}//end main
}
