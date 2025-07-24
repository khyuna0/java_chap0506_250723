package ch06_03_Exer;

public class MemberService {
	
	public boolean login(String id, String password) {	
		return (id.equals("hong") && password.equals("12345"));
	}
	// 문자열 비교 -> equals!!!!!!!
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
 