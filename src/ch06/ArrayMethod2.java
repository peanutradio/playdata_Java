package ch06; 

public class ArrayMethod2 { // 공유2

	public static void main(String[] args) {
		int [] points = {1,3,1,8};
		double results = average(points);  //point값 average와 공유
		System.out.println("results="+results);
	}

	private static double average(int[] arr) { // average의 값을 가진 더블 함수 호출
		System.out.println("average call!!");
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]="+arr[i]);
			sum = sum + arr[i];
			System.out.println("sum=sum+arr["+i+"] 했음!!");
		}
		System.out.println("sum="+sum);
		
		/*
		 * double avg = sum / arr.length; ==> 3.0 실수가 나온다.
		 * (자바에서 정수 타입 변수끼리 연산 결과는 정수)
		 * sum(13) / arr.length(4) => 3.25 아닌 3이다!	
		 */
		
		//실수 타입으로 바꿔서 계산
		double avg = (double)sum / (double) arr.length;
		System.out.println("avg = "+avg);
		System.out.println("average end!!!");
		return avg;
	}
}