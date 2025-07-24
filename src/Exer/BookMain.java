package Exer;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1 = new Book("bookname", "bookauthor", 200);
		
		System.out.println("두꺼운 책인가요? " + b1.isThickBook());
	}

}
