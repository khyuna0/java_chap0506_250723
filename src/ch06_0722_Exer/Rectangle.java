package ch06_0722_Exer;

public class Rectangle {
	
	int width; // 가로
	int height; // 세로
	
	
	// 기본 생성자(생략가능) -> 반환 타입이 아예 없고, 이름이 해당 클래스의 이름으로 고정
	// 생성자 -> 메모리에 객체 생성 

	public Rectangle() { //기본 생성자
		// TODO Auto-generated constructor stub
		}
	
	public Rectangle(int width, int height) { // () 안 -> 매개변수 parameter
		// 객체의 초깃값을 생성자를 통해 지정해줌. -> 생성 단계에서 값을 채워 객체를 만들 수 있음
		// 초기화가 완료된 상태로 객체를 만들어줌
		this.width = width;
		this.height = height;	
		}

	public int rectArea() { // 사각형 면적 반환 메소드
		return width * height;
	}



	
}
