package ch06_03_Exer;

public class ExerMain {

	public static void main(String[] args) {
		
		// 원의 면적 구하기
		
		Circle c1 = new Circle(10);
		
		System.out.println("원의 면적 : " +  c1.circleArea());
		
		System.out.println("==================");
		
		// 사칙연산 계산기 클래스
		
		Calculator cal1 = new Calculator(4, 2);
		
		cal1.result();
		
		System.out.println("==================");
		
		// 객체 속성으로 다른 객체 넣기

		// 속성이 될 객체 선언
		Engine engine1 = new Engine("가솔린", 3);
		
		Car car1 = new Car("소나타", 200, engine1);
		car1.CarEngineType();
		
		System.out.println("==================");
		
		// 생성자 오버로딩
		Rectangle r1 = new Rectangle(10, 10, "red");
		Rectangle r2 = new Rectangle(2, 2);
		Rectangle r3 = new Rectangle();
		
		//메소드 오버로딩 (다양성 ↑)
		System.out.println(r1.rectArea()); // 100
		System.out.println(r1.rectArea(5)); // 50
		System.out.println(r1.rectArea(1, 1)); // 1

		System.out.println("==================");
		
		// 3번
		MemberService m = new MemberService();
		boolean a = m.login("hong", "123456");
		System.out.println(a);
		
		m.logout("hong");
		
		System.out.println("==================");
		
		// 4번
		PrinterEx printerEx = new PrinterEx();
		
		printerEx.println(1234);
		printerEx.println(true);
		printerEx.println(1.234);
		printerEx.println("1234");
		
		
		
	}

}
