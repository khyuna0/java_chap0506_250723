package ch06_04;

import ch06_03_Exer.Engine;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator2 cal1 = new Calculator2();
		
		int result = cal1.add(2, 4);
		System.out.println(result);
		
		System.out.println(cal1.minus(4, 2));
		System.out.println(cal1.mul(4, 2));
		System.out.println(cal1.div(4, 2));
		
		System.out.println("==================");
		// 메소드의 인자값으로 배열 선언함
		
		// 방법 1
		System.out.println(cal1.totalSum(new int[] {1, 2, 3} ));
		
		System.out.println("==================");
		
		// 방법 2
		int[] arr1 = { 1, 2, 3, 4 };
		System.out.println(cal1.totalSum(arr1));
		
		System.out.println("==================");
		
		
		
		
	}

}
