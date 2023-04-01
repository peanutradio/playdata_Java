package ex08_5;
/*
 * 레퍼런스 변수 == (객체의 주소가 같은지 비교)
 * 레퍼런스 변수 equals(객체의 내용 이 같은지 비교) : 문자열 내용 같은지 비교
 */
public class ReferenceCompare1 {
	public static void main(String[] args) {
		//정수를 저장하는 객체
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		Integer i3 = new Integer(20);
		Integer i4 = i1;
		System.out.println("i1="+i1);
		System.out.println("i2="+i2);
		System.out.println("i3="+i3);
		System.out.println("i4="+i4);
		
		System.out.println("i1==i2:"+ (i1==i2) );
		System.out.println("i1.equals(i2) :" + i1.equals(i2) );
		
		System.out.println("i1==i3:"+ (i1==i3) );//false
		System.out.println("i1.equals(i3) :" + i1.equals(i3) );//false
		
		System.out.println("i1==i4:"+ (i1==i4) );
		System.out.println("i1.equals(i4) :" + i1.equals(i4) );
	}
}