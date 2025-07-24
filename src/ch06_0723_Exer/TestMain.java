package ch06_0723_Exer;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Book
		
		Book book = new Book("책1", 10000);
		book.printInfo();
		
		System.out.println("===============");
		
		// 2. StringTool
		
		StringTool stringTool = new StringTool();
		stringTool.printLength("가나다");
		
		System.out.println("===============");
		
		// 3. AverageCalculator
		
		AverageCalculator averageCalculator = new AverageCalculator();
		int[] num = {1,2,3,4,5};
		averageCalculator.getAverage(num);
		
		System.out.println("===============");
		
		// 4. BMI
		
		BMI bmi = new BMI();
		bmi.bmiCalulator(50.0, 165.5);
		
		System.out.println("===============");
		
		// 5. Rectangle
		
		Rectangle rectangle1 = new Rectangle(5.0, 4.0); // double
		rectangle1.recRound();
		
		System.out.println("===============");
		
		// 6. Triangle
		
		Triangle triangle1 = new Triangle();
		boolean t1 = triangle1.isVaild(1, 2, 3);
		System.out.println(t1); // F
		
		System.out.println("===============");
		
		Triangle triangle2 = new Triangle();
		boolean t2 = triangle2.isVaild(3, 4, 5);
		System.out.println(t2); // T
		
		
	}

}
