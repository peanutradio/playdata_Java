package ch09_ex;

import java.util.ArrayList; //API 불러오기 - Array API
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>(); //String 저장을 위한 배열 생성.
		
		names.add("Kim");
		names.add("Lee");
		names.add("Park");
		names.add("Choi");
		
		names.set(0, "Han"); //인덱스 0번  Han으로 변경
		String removed = names.remove(1); // 인덱스 1번 재거 후, 해당 값 반환.
		
		for (int i = 0; i<names.size(); i++) {
			System.out.printf("\n%s", names.get(i)); // 인덱스 i 값을 반환.
		}
	}
}
