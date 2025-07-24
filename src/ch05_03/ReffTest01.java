package ch05_03;

import java.util.Arrays;

public class ReffTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열 복사하기_1 -> 비어있는 배열에 대입연산자 사용해서 대입 가능 / 얕은 복사
		int[] arr1 = null; // 스택 영역에만 생성되고 힙영역에 생성 x . 번지수 없음
		int[] arr2 = {1,2,3,4,5};
		arr1 = arr2;
		
		arr2[3] = 10; // 같은 곳을 참조하기 때문에 값이 반영됨
		
		Arrays.toString(arr2);
		System.out.println(arr1[3]);
		
		System.out.println("=====================");
		
		// 해시코드도 일치함
		System.out.println("arr1의 해시 코드" + System.identityHashCode(arr1));
		System.out.println("arr2의 해시 코드" + System.identityHashCode(arr2));
		
		System.out.println("=====================");
		
		// 배열 복사하기_2 -> 깊은 복사
		int [] arr3 = null;
		int [] arr4 = { 10, 20, 30 };
		
		
		// 붙일 배열 = Arrays.copyOf ( 원본 , 가져올 원소 개수 )
		arr3 = Arrays.copyOf(arr4,3);
		for (int num : arr3) {
			System.out.println(num);
		}
		
		System.out.println("=====================");
		
		System.out.println("arr1의 해시 코드" + System.identityHashCode(arr3));
		System.out.println("arr2의 해시 코드" + System.identityHashCode(arr4));
		
		System.out.println("=====================");
		// 
		String str = null;
		str = "tiger";
		System.out.println(str);
		
		System.out.println("=====================");
		
		String str2 = "tiger";
		str2 = "null"; // 낭비되는 공간이 되버림 garbage collection
		System.out.println(str2); // null 값 출력
		
		
	}

}
