package ex09; // Java 배열 API

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(10); l1.add(20);
		System.out.println("l1="+l1);
		
		ArrayList<Double> l2 = new ArrayList<Double>();
		l2.add(10.5); l2.add(20.0);
		
		System.out.println("l2="+ l2);
		
		//==============================================
		ArrayList<String> names = new ArrayList<String>(); // String 저장을 위한 arrayList객체 생성
		names.add("Kim"); names.add("Lee"); names.add("Park"); // String 데이터 추가
		names.add("Choi");
		
		System.out.println("names="+ names);
		
		names.set(2,"Han");// 2번 인덱스를 Han으로 변경
		System.out.println("Han으로 수정한 후 names="+ names);
		
		String removed = names.remove(1); // 1번 인덱스 삭제//
		System.out.println("removed = "+ removed); // 1번 인덱스 제거 후, 해당 값 반환.
		
		System.out.println("Lee 삭제한 후 names ="+ names);
		System.out.println("names.size() = "+ names.size() );
		
		for (int i=0; i<names.size(); i++) { //Array 리스트에 담긴 데이터의 개수 반
			System.out.printf("\nnames.get("+i+")"+ names.get(i));
		}
	}
}