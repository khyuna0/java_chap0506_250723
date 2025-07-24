package ch06_06;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member member = new Member();
		
		//member.id = "tiger"; -> 필드인 id 에 private 값을 넣을 수 없음
		member.setName("홍길동");
		member.setId("tiger");
		member.setPw("t1234");
		member.setAge(21);
		
		// System.out.println(member.name); -> 필드가 private . 불가능 ->getter 로 해결
		System.out.println(member.getName()); // getter 로 private 필드 값 가져옴
		
		
		
		Member member2 = new Member("이순신", "lion", "lion1234", 23);
		// member2.age = 50; / 객체 내의 필드값을 너무 쉽게 바꿀 수 있는 문제. 
		
		
		
		
		
		
	}

}
