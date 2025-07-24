package Exer;

public class Student1 {
	// 나이, 학번, 학년, 반, 이름
	int age; // 나이
	int sNum; // 학번
	int grade; // 학년
	int cNum; // 반
	String name; // 이름
	
	// 생성자 초기화 
	public Student1(int age, int sNum, int grade, int cNum, String name) {
		super();
		this.age = age; // this 참조
		this.sNum = sNum;
		this.grade = grade;
		this.cNum = cNum;
		this.name = name;
	}
	
	// 메소드 형식 - public 타입 메소드명(첫글자소문자)() { 실행문 + return (<-필수) }
	
	// 학년과 반을 출력하는 메소드

	public String classNum() {
		String print = grade + "학년" + cNum + "반";
		return print;
	}
	
	
	
}
