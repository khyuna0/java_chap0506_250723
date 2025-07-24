package ch06_05;

public class SingletonTest { // 메모리에 반드시 하나만 존재해야 하는 인스턴스 ( 없거나 하나거나...)
	
	//  private static 클래스이름 변수이름 형식
	private static SingletonTest singletonTest = new SingletonTest(); // 이 클래스 내에서만 사용 가능한 변수

	private SingletonTest() { // private 생성자로 호출 막음. 외부( 이 클래스 외부)에서 호출 불가
	
	}
	
	// 인스턴스 생성 메소드
	public static SingletonTest getInstance() { // 메소드 이름 : getInstance() 관례
		return singletonTest;
	}
	
}
