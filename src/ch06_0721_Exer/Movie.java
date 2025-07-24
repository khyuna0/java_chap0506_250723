package ch06_0721_Exer;

public class Movie {
	String title;
	String genre;
	int runtime;
	
	public Movie() { // 기본 생성자
		
	}

	public Movie(String title, String genre, int runtime) { // 매개변수 개수가 다른 생성자 -> 다른 생성자
		super();
		this.title = title;
		this.genre = genre;
		this.runtime = runtime;
	}
	
	public Movie(String title) {
		// 다른 생성자 -> 매개변수 1개
	}
	
	// 생성자 오버로딩 -> 매개변수 개수가 다른 생성자를 여러개 생성하는 것 
	
	public boolean isLongMovie() {
		return runtime >= 120; // if 없이도 계산 끝나면 t or f 반환
	}

}
