package ch06_0723_Exer;

public class AverageCalculator {
	
	
	
	public void getAverage(int[] nums) {
		int total = 0;
		for ( int n : nums ) {
			total = total + n;
		}
		double result = total / nums.length;
		System.out.println(result);
	}

}
