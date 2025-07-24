package ch06_05;

public class Ch06_05_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest st1 = new StaticTest(); // 인스턴스(객체) 생성
		st1.width = 1;
		st1.height = 2;
		st1.color = "red";
		
		StaticTest st2 = new StaticTest(); 
		st2.width = 3;
		st2.height = 4;
		st2.color = "blue";
		// st2.PI = 3.141592; final 이 붙은 정적 변수는 값 변경 불가. -> 상수
		
		
		
	}

}
