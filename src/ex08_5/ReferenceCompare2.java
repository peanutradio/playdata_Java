package ex08_5;

public class ReferenceCompare2 {
/*
 *  1. 레퍼런스 변수 비교
 *     == : 객체의 주소가 같은가?
 *     equals() : 객체의 내용이 같은가? 
 *      
 *      s1 == charArr : false
 *      s1.equals( String.valueOf(charArr) : true
 *      
 *  2. 자바의 String
 *  	같은 내용의 문자열을 또 사용할 때는 새로 만들지 않고 기존의 문자열을 공유한다. 
 *      String s1 = "hello";    
 *      ..........
 *      // 기존의 "hello" s1이 있어서 새로 안만들고 s1을 공유!!
 *      // 메모리를 아끼려고.
 *     String s3 = "hello";
 *     
 *     s1 == s3 : s1과 s3 주소 같은 true
 *     s1.equals(s3) : s1과 s3 내용 같은 true
 *     
 *     // s3의 내용이 수정되면 새로운 문자열 hi 만들고, s3가 hi 참 s1과 공유하지 않는다.
 *        s3 = "hi"; // 새로운 문자열 hi 만들고,s3가 hi 참조 s1과 공유 안한다.
 *      
 *      s1 == s3 : s1과 s3 주소 다름  false
 *      s1.equals(s3) : s1과 s3 내용 다름 false
 *      
 *   3. 입력 받은 문자열, String 타입 아닌 문자열 -> 주소 다름
 *      
 *      String s4 =sc.nextLine();
 *      String s5 = String.calueOf(charArr)
 *      
 *      s1 == s4 : s1과 s4 주소 다름 false
 *      s1 == s5 : s1과 s5 주소 다름 false
 *      
 *      s1.equals(s4) : s1과 s4 내용 같음 true
 *      s1.equals(s5) : s1과 s5 내용 같음 true
 *   
 *   4. String == 해서 고민하지 말고,
 *      아무튼 내용이 같으면 equals() true
 *      문자열 비교는 equals() 사용합시다.
 *      고민할 시간에 딴 일 합시다.  
 *      
 */
	public static void main(String[] args) {
		String s1 = "hello";
		char[] charArr = {'h','e','l','l','o'};
		System.out.println("s1="+s1);
		System.out.println("String.valueOf(charArr)="+String.valueOf(charArr));
		
		System.out.println(
				"s1==String.valueOf(charArr):"+s1==String.valueOf(charArr));
		System.out.println(
				"s1.equals(String.valueOf(charArr))="
		        + s1.equals( String.valueOf(charArr) )
				);
		
		String s2 = "good";
		String s3 = "hello";
		System.out.println("s1==s2:"+ (s1==s2) ) ;//false
		System.out.println("s1.equals(s2):"+ s1.equals(s2)); //false
		
		System.out.println("s1==s3:"+ (s1==s3));//true
		System.out.println("s1.equals(s3):"+s1.equals(s3));//true
		
		System.out.println("s3를 hi로 바꿈!!!==============");
		s3="hi";
		System.out.println("s1="+s1); //hello
		System.out.println("s3="+s3); //hi
		
		System.out.println("s1==s3:"+ (s1==s3)); //false
		System.out.println("s1.equals(s3):"+s1.equals(s3)); //false
		
		
	}
}