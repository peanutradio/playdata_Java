package ch04;

public class ThreeSixNine {

	public static void main(String[] args) {
	    for (int i=1; i<=1000;i++) {
	    	//정수 i을 문자열로 변환
			String str = Integer.toString(i);
			System.out.println("str="+str);
			
			//문자열 str을 char 배열로 변환
			char[] charArr=str.toCharArray();
			//char 배열에서 문자 1개씩 el에 저장
			for(char el: charArr) {
				//System.out.println("el="+el);
				//3 6 9 이면
				if(el=='3' || el=='6' || el=='9') {
					System.out.println("짝!!");
					//inner 반복 종료
					break;
				}
			}
		    System.out.println("================");
	    }
	}
}