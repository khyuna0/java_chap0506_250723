package ch06_05;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonTest single1 = SingletonTest.getInstance(); // return 값으로 SingletonTest 객체를 반환

		SingletonTest single2 = SingletonTest.getInstance();
		
		if (single1 == single2) {
			System.out.println("동일");
		}	
		
		
		
	}

}
