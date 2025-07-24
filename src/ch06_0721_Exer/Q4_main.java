package ch06_0721_Exer;

public class Q4_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie m1 = new Movie("movieName", "movieGenre", 130);

		System.out.println("긴 영화인가요? " + m1.isLongMovie());
		
		System.out.println("=================");
		
		Movie m2 = new Movie("movieName2", "movieGenre2", 110);

		System.out.println("긴 영화인가요? " + m2.isLongMovie());
		
		System.out.println("=================");
		
		Movie m3 = new Movie("movieName3"); // 생성자 호출 과정에서 원하는 생성자 선택 가능
		
		System.out.println("=================");
		
		Movie m4 = new Movie();
		
		m4.title = "movieName3";
		m4.genre = "movieGenre3";
		m4.runtime = 100;
		
	}

}
