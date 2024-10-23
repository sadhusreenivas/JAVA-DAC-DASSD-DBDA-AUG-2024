package demo;

public class Book implements Cloneable{ // fully encapsulated 
	private int isbn;
	private String title;
	private String author;
	private double price;
	private int pages;
	
	public Book(int isbn, String title, String author, double price, int pages) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		this.pages = pages;
	}
	
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", price=" + price + ", pages="
				+ pages + "]";
	}

	public String getTitle() {
		return title;
	}
	
public static void main(String[] args) throws CloneNotSupportedException{
		
		Book b1 = new Book(12345, "Java", "James", 500, 700);
		System.out.println(b1);
		
		Book b2 = (Book) b1.clone();
		System.out.println(b2);
	
}
}
