package ch06;

public class MultiArray { // 다차원 배열

	public static void main(String[] args) {
		int[] row1 = {1,2,3,4};
		int[] row2 = {5,6,7,8,9,10};

		int[][] matrix = {row1, row2}; // row1,2를 matrix 으로 묶

		System.out.println("matrix[0][0]="+matrix[0][0]);
		System.out.println("matrix[0][1]="+matrix[0][1]);
		System.out.println("matrix[0][3]="+matrix[0][3]);
		System.out.println("matrix[1][2]="+matrix[1][2]);
		System.out.println("matrix[1][4]="+matrix[1][4]);

		// 다차원 배열 length로 입력값들 수 파악하
		System.out.println("matrix[0].length = "+ matrix[0].length); //4
		System.out.println("matrix[1].length = "+ matrix[1].length); //6
		System.out.println("matrix.length =" +matrix.length); //2
		
		//Matrix for문으로 출력해보기(이중 for문으로)
		for(int i=0; i<matrix.length; i++) {
			System.out.println("i="+i);
			System.out.println("matrix["+i+"].length="+ matrix[i].length);
			for(int j=0; j<matrix[i].length; j++) {
				System.out.println("j="+j);
				System.out.println("matrix["+i+"]["+j+"]="+matrix[i][j]);
			}//end for j
			System.out.println("========================");
		}//end for i
	}//end main
}//end class

