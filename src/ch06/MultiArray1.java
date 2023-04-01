package ch06;

public class MultiArray1 {

	public static void main(String[] args) {
		int [][] gugudan = new int[3][4]; // 4개의 원소들을 가진 3개의 다차원 배열 
		                                  // new로 원소들을 o으로 초기화.
		System.out.println("gugudan.length="+ gugudan.length);
		for(int i=0;i<gugudan.length; i++) {
			System.out.println("====================");
			System.out.println("i="+i);
			System.out.println("gugudan["+i+"].length="+ gugudan[i].length);
			
			for(int j=0; j<gugudan[i].length; j++) {
				System.out.println("j="+j);
				gugudan[i][j]=(i*j);
				System.out.println("gugudan["+i+"]["+j+"]="+gugudan[i][j]);
			}//end for j
		}//end for i
	}//end main
}//end class