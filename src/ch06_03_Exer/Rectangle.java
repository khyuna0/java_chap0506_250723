package ch06_03_Exer;

public class Rectangle {
	int width;
	int height;
	String color;
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(int width, int height, String color) {
		super();
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	// 매개변수의 개수나 타입에 따라 여러개 만들기 가능 -> 메소드 오버로딩 
	
	// 1. 매개변수의 개수가 다른 경우
	public int rectArea() { // main 에서 초기화한 값
		return width * height; 
	}
	
	public int rectArea(int width, int height) { // 
		return width * height; 
	}
	
	public int rectArea(int width) {
		return width * this.height; // 메인에서 지정한 초깃값 
	}
	
	// 2. 매개변수의 타입이 다른 경우 
	
	public double rectArea(double width) {
		return width * height;
	}
}