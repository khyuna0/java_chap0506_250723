package ch06_03_Exer;

public class Circle {
	
	int radius; // 반지름
	double PI = 3.14; //상수
	
	public Circle() {
		
	}
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	// 입력된 반지름을 가진 원의 면적을 반환하는 메소드
	
	public double circleArea() {
		return PI*(radius*radius); 
	}
	
}
