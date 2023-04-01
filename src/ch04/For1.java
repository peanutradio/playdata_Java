package ch04;

import java.util.stream.IntStream;

public class For1 {

	public static void main(String[] args) {
		// Python스러운 for문 
//		int [] num = {0,1,2,3,4};
//		
//		for(int el: num) { 
//			System.out.println("el = "+el);
//		}
		
//		// JAVA스러운 for문
//		for (int el=0; el<5; el++)
//			//   초기값  조건식  수행
//			System.out.println("el = "+el);
//		}

		// JAVA를 파이썬 range(0,10) 처럼 구현하고 싶을 때 
	    IntStream.range(0,10).forEachOrdered(
	    		n->{                         //java 람다 함
	    			System.out.println("n = "+n);
	    		}	    		
	    );
	}
}	