package ch06_03_Exer;

public class Car {
	
	String name;
	int maxspeed;
	Engine engine; // -> Engine 클래스로 만든 객체를 선언 / 속성
	
	public Car() {
		
	}
	
	public Car(String name, int maxspeed, Engine engine) {
		super();
		this.name = name;
		this.maxspeed = maxspeed;
		this.engine = engine;
	}
	
	public void CarEngineType() {
		// 객체 속성 중 type 뽑아줌 -> 메인에서 지정
		System.out.println("엔진 타입 : " + engine.type); 
		engine.printEngine(); 
		
	}
	
	public Engine outpuEngine() {
		engine.type = "디젤";
		engine.dpm = 2;
		return engine;
	}
	
	public String[] outputCars() {
		String[] cars = {"소나타" , "아반떼"};
		CarEngineType(); // 한 클래스 안에서는 메소드끼리 호출 가능함
		return cars;
	}
	
}
