package ch06_0722_Exer;
public class SchoolClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String a = "kor";
//		String b = new String ("kor");
		
		Student stu1 = new Student();  // 메모리에 stu1이란 객체가 생성됨
		stu1.name = "홍길동";
		stu1.hakbun = "20250722";
		stu1.address = "서울시 강남구";
		stu1.age = 18;
		stu1.phone = "010-1234-1234";
		stu1.schoolName = "현대고"; // 이미 초기화된 필드의 값을 바꿀 수 있음
		stu1.outputName(); // 객체 안의 name 값을 출력함
		stu1.scores[0] = 90;
		stu1.scores[1] = 80;
		stu1.scores[2] = 100;
		
		
		Student stu2 = new Student(); // stu2 생성
		stu2.name = "김유신";
		stu2.hakbun = "20240721";
		stu2.address = "서울시 송파구";
		stu2.age = 23;
		stu2.phone = "010-1234-5678";
		stu2.outputName();
		
		
	}

}
