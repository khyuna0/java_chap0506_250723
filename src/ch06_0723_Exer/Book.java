package ch06_0723_Exer;

public class Book {
	
	String name;
	int price;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("책 이름 : " + name );
		System.out.println("책 가격 : " + price );
	}
	
}
