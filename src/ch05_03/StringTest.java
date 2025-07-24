package ch05_03;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1 = 'a';
		char ch2 = 'b';
		char ch3 = 'c';
		
		// String 의 원리
		
		char[] chArr = { 'a','b','c' };
		System.out.println(chArr);
		System.out.println(chArr[0]); // -> a
		
		System.out.println("===================");
		
		String str = "abc";
		System.out.println(str);
		//System.out.println(str[0]); -> 불가
		
		System.out.println("========================");
		
		String a = "tiger";
		String b = "tiger"; // 기존 문자열이 존재하는지 검색 후에 똑같은 문자열이 존재하면 같은 주소를 참조하는 방식으로 생성
		String c = new String("tiger"); // 무조건 메모리에 새로 문자열 생성
		
		// !! 문자열 비교는 == 사용하지 않음 !!
		
		// 문자열 번지수만 비교하기 -> 내부 문자열이 같아도 참조하는 번지수가 다르기 때문에 a == b 가 참일수도, 거짓일 수도 있음
		
		if (a == b) { // 같은 주소가 참조됨
			System.out.println("두 문자열은 같다");
		} else {
			System.out.println("다르다");
		}
		
		System.out.println("========================");
		
		if (a == c) { // c 는 새로운 번지(번지수가 다름)기 때문에 결과는 거짓
			System.out.println("두 문자열은 같다");
		} else {
			System.out.println("두 문자열은 다르다");
		}
		
		System.out.println("========================");
		
		// 객체 상관없이 내부 문자열 비교하기
		// 문자열 비교는 equals 사용!!!
		
		if (a.equals(c)) { 
			System.out.println("두 문자열은 같다");
		} else {
			System.out.println("다르다");
		}
		
		System.out.println("========================");
		
		// 참조 비교하기 (같은 곳을 참조하는지?) -> hash 값으로 비교! (잘안씀)
		
		System.out.println("a의 해시 코드" + System.identityHashCode(a));
		System.out.println("b의 해시 코드" + System.identityHashCode(b));
		System.out.println("c의 해시 코드" + System.identityHashCode(c));
		
		// ● null
		// 참조 타입 변수만 null 값으로 초기화 가능
		
		
		
		
		
	}

}
