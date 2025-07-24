package ch06_04;

public class Calculator2 {
	
	
	// 인수의 개수, 타입 정해주기
	public int add(int num1, int  num2) { // () 안 -> 인수 / 인자값 / arg
		return num1 + num2;
		// main 에서 객체변수.메소드() / () 안의 값으로 인수(인자값) 초기화
		// 초깃값은 인수 타입, 수와 일치해야 함
	}	
	
	public int minus(int num1, int num2) {
		return num1 - num2;
	}
	
	public int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	public double div(int num1, int num2) {
		double result = (num1 / num2);
		return result;
	}
	// 매개변수 개수를 모르는 경우 : 배열로 선언하기
	
	// totalSum -> 배열의 각 원소를 더하는 메소드
	// main 에서 선언한 배열을 인수로 넣어줌
	public int totalSum(int[] array) { // numbers 배열 선언
		int total = 0;
		for( int n : array ) { 
			total = total + n;
		}
		return total;
		// return 문 다음엔 코드 인식 못함
		
		
	}
}

