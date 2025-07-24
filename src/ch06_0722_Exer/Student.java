package ch06_0722_Exer;

public class Student {
	
	// 속성, 필드, 멤버변수 (클래스 내에 선언된 함수)
	
	String schoolName = "중앙고";
	String name; // 학생의 이름
	String hakbun; // 학번
	int age;  // 나이
	String phone;; // 전화번호
	String address; // 주소
	int [] scores = new int[3]; // 배열 선언도 가능, 길이가 3인 배열 선언
	
	
	// 메소드 ( 클래스 내에 선언한 함수)
	
	public void outputName() { 
		System.out.println(name);
	}
} 