package ch05_03;

public class EnumTest01 {
	// 열거 타입
	enum Gender { // 열거 타입 선언
		MAlE,FEMALE // 열거 상수
	}
	
	public static void main(String[] args) {
		
		Gender g = Gender.FEMALE; // g = 열거 타입 변수
		
		if (g == Gender.MAlE) {
			System.out.println("남성");
		} else {
			System.out.println("여성");
		}
		
		
		
	}
}
