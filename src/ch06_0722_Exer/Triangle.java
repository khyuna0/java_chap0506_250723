package ch06_0722_Exer;

public class Triangle {
	
	
	// 삼각형의 추상화 필드, 속성, 멤버변수
	int height;
	int width;
	String color;
	
	// 메소드 -> 반환하는 값의 타입으로 지정 \ 반환하는 값이 없는 메소드 - void
	// 삼각형의 면적
	public double triangleArea() { // 첫글자 소문자
		double area = height * width * 0.5;
		return area; // 반환하는 명령어 (필수) if 반환할 값이 없으면  void 로 지정 
	}
	
	// 삼각형의 색깔
	public String triangleColor() {
		System.out.println("삼각형의 색 : " + color );
		return color;
	}
	
	
}
