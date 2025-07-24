package ch06_06;

public class Tire { // public 을 없애도 같은 패키지 내에서는 사용 가능함
	 
	 String tireName;
	 int tirePrice;

	public Tire(String tireName, int tirePrice) {
		super();
		this.tireName = tireName;
		this.tirePrice = tirePrice;
	}

	public void tirePrint() {
		 System.out.println(tireName);
	 } 
 
	// protected -> 같은 패키지 내에서만 접근 가능하도록 지정함
}