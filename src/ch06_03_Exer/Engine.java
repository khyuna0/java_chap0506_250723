package ch06_03_Exer;

public class Engine {
	
	String type;
	int dpm;
	
	public Engine() {
		
	}

	public Engine(String type, int dpm) {
		super();
		this.type = type;
		this.dpm = dpm;
	}
	
	public void printEngine() {
		System.out.println("엔진 타입 : " + type);
	}
}
