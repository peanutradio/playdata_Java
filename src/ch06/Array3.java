package ch06;

public class Array3 {

	public static void main(String[] args) {
		/*
		 * 배열을 선언만 하고 값을 설정 안하면 에레 발생
		int[]scores;
		
		System.out.println(scores[0]); --> 사용할 때 에러!!	
        */
		
		int[] scores = new int[5];
		System.out.println("scores,length = "+ scores.length);

		
		for(int i=0; i<5; i++) {
			System.out.println("scores["+i+"]="+scores[i]);
		}
	}
}
