package ch06_03_Exer;

public class Calculator {
	
	double num1; // 첫번째 입력 정수
	double num2; // 두번째 입력 정수
	
	public Calculator() {
		
	}
	
	public Calculator(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void result() {
		System.out.println("덧셈 결과 : " + (num1 + num2));
		System.out.println("뺄셈 결과 : " + (num1 - num2));
		System.out.println("곱셈 결과 : " + (num1 * num2));
		System.out.println("나눗셈 결과 : " + (num1 / num2));
		System.out.println("첫번째 수 제곱 결과 : " + (num1 * num1));
		
	}
	

}
