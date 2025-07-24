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
		bmi.bmiCalulator(55.0, 165.5);
		
		System.out.println("===============");
		
		// 5. Rectangle
		
		Rectangle rectangle1 = new Rectangle(5.0, 4.0); // double
		System.out.println((rectangle1.dHeight) + (rectangle1.dWeight));
		
		Rectangle rectangle2 = new Rectangle(5, 4); // int
		System.out.println((rectangle2.iHeight) + (rectangle2.iWeight));
		
		System.out.println("===============");
		
		// 6. Triangle
		
		Triangle triangle1 = new Triangle();
		boolean t1 = triangle1.isVaild(1, 2, 3);
		System.out.println(t1); // F
		
		System.out.println("===============");
		
		Triangle triangle2 = new Triangle();
		boolean t2 = triangle2.isVaild(2, 2, 3);
		System.out.println(t2); // T
		
		System.out.println("===============");
		
	}

}
