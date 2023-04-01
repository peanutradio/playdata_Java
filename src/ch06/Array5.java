package ch06;

public class Array5 {

	public static void main(String[] args) {
		
		int[] arr = { 88,76,92,68,55,48,82 };
		int sum = 0;
		
		System.out.println("arr.length = "+ arr.length);
	
		for(int i=0; i<arr.length; i++) {
			System.out.println("sum = sum+arr["+i+"] 할꺼임");
			sum = sum + arr[i];
			System.out.println("===============================");
		}
		System.out.println("반복종료!!");
		System.out.println("sum = "+ sum);
	}
}
