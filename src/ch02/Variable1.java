package ch02;

public class Variable1 {

	public static void main(String[] args) {
		int age = 41;
		// age = "먹을만큼 먹었다"' -> 에러. 정수만 저장된다.
		
		String name = "박찬후 ";
		System.out.println("안녕 반가워 내 이름은"+ name +"입니다!!!");
		System.out.println("내 나이는 " + age + "입니다!!");
		System.out.println("내 나이가 어때서!");
		
		//int housePrice = 2800000000; -> int는 21억 단위까지 가능
		long housePrice = 2800000000L;
		System.out.println("반포 자이 집값!!!"+ housePrice);
		
		double rating = 9.82;
		System.out.println("평점"+ rating);
		
		boolean hungry = true;
		System.out.println("나는 배고픈가?"+hungry);
		/*
		 *자바에서는 true와 0과 정수연산 비교 불가능.
		 *자바 true + false => 에러 발생
		 * 
		 * 파이썬과 같이 true -> 1 저장       
		 *            false -> 0 저장.
		 * 파이썬에서는 true+true+false+100 ==>102
		 * 파이썬  true ==1  -> true

		 */
		
		boolean isBoomuk = true;
		// isBoomuk + 100; -> 에러
		//isBoomuk + false; -> 에
		//isBoomuk == 1 ; ->에러 (정수와 비교 불가)
		
        // 상수 정		
		final int NOT_FOUND = 404;
		// NOT_FOUND = 200; ->에러 상수값을 변경 불가
		
		/*
		 * 기본 타입은 값 복
		 * 원본 사본 2개
		 * 사본 바꿔도 원본 안바뀜.
		 */
		double origin = 3.14;
		double copy = origin;
		System.out.println("origin :"+ origin); //3.14
		System.out.println("copy :"+ copy); //3.14
		
		copy = 1004;
		
		System.out.println("copy를 1004로 바꾼 후!!");
		System.out.println("origin: "+ origin); //3.14
		System.out.println("copy :"+ copy); //1004.0
		
		/*
		 * 래퍼런스 타입은 값 공유
		 * 1개의 값이 공유
		 * 하나를 바꾸면나머지도 변함 
		 */
		
		StringBuffer sbOrigin = new StringBuffer("안녕");
		//값 공유
		StringBuffer sbCopy = sbOrigin;
		System.out.println("sbOrigin = "+ sbOrigin);
		System.out.println("sbCopy = "+ sbCopy);
		//sbCopy 에 문자열 추가
		sbCopy.append("반가워");
		System.out.println("sbCopy 문자열 추가 후");
		System.out.println("sbOrigin"+sbOrigin);
		System.out.println("sbCopy ="+sbCopy);
		System.out.println("===================");
		
		
		
		
		String item = "라면 ";
		long price = 80000000000L;
		float weight = 0.12F;
		boolean discounted = false;
		System.out.printf("이름:%s 가격:%d 무게: %.2fkg 할인:%b", 
				           item, price, weight, discounted);
		
		System.out.println("\n2*1=2\t3*1=3\t4*1=4");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
