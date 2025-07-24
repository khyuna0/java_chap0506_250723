package Exer;

public class Book {
	String title;
	String author;
	int pages;
	
	public Book(String title, String author, int pages) {
		super();
		this.title = title;
		this.author = author;
		this.pages = pages;
	}

	public boolean isThickBook() {
		if (pages >= 300) {
			return true;
		} else {
			return false;
		}
		
	}
}
