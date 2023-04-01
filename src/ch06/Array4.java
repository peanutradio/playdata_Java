package ch06;

public class Array4 {

	public static void main(String[] args) {
		// 0이 10개 저장된 배열 선언	
		//int[] arr = {0,0,0,0,0,0,0,0,0,0};->뻘 짓거리...

		int[] arr = new int[10]; //--> *****신박하군!!!****
		for(int i=0; i<arr.length; i++) {
			System.out.println("i="+i);
			System.out.println("arr["+i+"]="+arr[i]);
			System.out.println("====================");
	}
  }
}