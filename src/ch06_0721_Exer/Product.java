package ch06_0721_Exer;

public class Product {
	
	
	//필드
	
	String name; // 상품명
	int price; // 가격
	int quantity; // 수량
	
	// 생성자 필드 
	public Product(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}



	// 메소드
	
	public int getTotalPrice() {
		return price * quantity;	
	}
	
}
