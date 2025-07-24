package ch06_0723_Exer;

public class Triangle {

	
	public boolean isVaild( int a, int b, int c) {
		
		int max = 0;
		if (a >= b && a >= c) 
		{ max = a; }
		else if (b >= a && b >= c) {
		    max = b;
		} else {
		    max = c;
		}
		
		int sum = a + b + c;
		return ( ( sum - max ) > max ); 
		
		
		// (a + b) > c , (b + c) > a , (c + a) > b 
	}
}
