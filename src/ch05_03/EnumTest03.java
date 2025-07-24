package ch05_03;

enum Season {
	SPRING, SUMMER, FALL , WINTER
}

public class EnumTest03 {
	
	public static void main(String[] args) {
		
		Season now = Season.WINTER;
		
		switch (now) {
			case SPRING:
				System.out.println("봄 입니다.");
				break;
				
			case SUMMER:
				System.out.println("여름 입니다.");
				break;
				
			case FALL:
				System.out.println("가을 입니다.");
				break;
				
			case WINTER:
				System.out.println("겨울 입니다.");
				break;
		
		}
		
		
	}
}
