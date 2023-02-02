package circular_queue;

public class Book 
{
	int bookid;
	String title;
	double price;
	
	
	public Book() {
	bookid=1;
	title="Teri kahani";
	price=2342.45;
	}


	public Book(int bookid, String title, double price) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", title=" + title + ", price=" + price + "]";
	}
	
	
	
}
