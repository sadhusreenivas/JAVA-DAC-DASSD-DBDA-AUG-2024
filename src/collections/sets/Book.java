package collections.sets;

public class Book {
	String title;
	String authror;
	double price;
	int pages;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthror() {
		return authror;
	}

	public void setAuthror(String authror) {
		this.authror = authror;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public Book(String title, String authror, double price, int pages) {
		super();
		this.title = title;
		this.authror = authror;
		this.price = price;
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", authror=" + authror + ", price=" + price + ", pages=" + pages + "]";
	}

	
}
