package ch06_06;

import ch06_06_01.AutoCar;

public class Car {
	
	public static void main() { 
		
		AutoCar autoCar = new AutoCar(); // 다른 패키지 -> import 문 필요
		Tire tire = new Tire("금호",100000); // 같은 패키지 -> public 없이도 사용 가능, import 문 불필요
		
	}
}
