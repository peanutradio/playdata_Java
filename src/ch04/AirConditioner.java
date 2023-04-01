package ch04;

public class AirConditioner {
	public static void main(String[] args) {
		turnOn(39);
	}
	public static void turnOn(int temperature) {
		System.out.println("temperature="+temperature);
		
		// temperature가 25도 초과 
		if (temperature > 25) {
			System.out.println("에어컨을 가동합니다!!!" );
			    //temperature가 25 초과, 35 미만
				if (temperature < 35 ) {
					System.out.println("아이스 커피 필요!");
				}else { //temperature 25 초과 35 초과 
					System.out.println("휴가 필요!!!");
				}
			
		}else { // temperature 25 이하 
			System.out.println("에어컨 가동 불가!!!");
				if (temperature<10) {
					System.out.println("패딩 필요!!");
				}
		}
		System.out.println("===================================");
	}
	
}

