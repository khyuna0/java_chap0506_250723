package ch06_06;

public class Member {
	
	private String name; // 회원 이름
	private String id; // 아이디
	private String pw; // 비밀번호
	private int age; // 나이
	
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(String name, String id, String pw, int age) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
	}
	
	
	// Setter 메소드 -> Setter 메소드를 통해 값 넣기 (필드 수 만큼)
	
	public void setId(String id) {
		this.id = id; }
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if ( age > 0 ) { // 무결성
		this.age = age; 
		} 
	}
	
	// Getter
	
	public String getName() { // 타입 = 필드 타입
		return this.name;
	}
	
}
