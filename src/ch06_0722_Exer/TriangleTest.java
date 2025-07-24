package ch06_0722_Exer;

public class TriangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle t1 = new Triangle(); // 객체 선언 , 인스턴스 생성
		t1.color = "red";
		t1.height = 4; 
		t1.width = 3;
		
		// 메소드 호출
		// 메소드는 정해진 작업만 수행함
		double triarea = t1.triangleArea();		
		System.out.println(triarea);
		
		// method call
		String tricolor = t1.triangleColor();
		
		Triangle t2; //  t2 는 클래스 변수, 번지 값을 리턴
		t2 = new Triangle();  // 메모리에 인스턴스 생성
		
		
	}
	
}
