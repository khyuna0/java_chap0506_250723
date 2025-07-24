package ch06_0722_Exer;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r1 = new Rectangle();
		// 객체 선언 = 생성자 호출 
		r1.height = 10;
		r1.width = 5;
		
		int area = r1.rectArea();
		System.out.println(area);
		
		Rectangle r2 = new Rectangle(10,20);
		
		int area1 = r2.rectArea();
		System.out.println(area1);
		
	}
}
