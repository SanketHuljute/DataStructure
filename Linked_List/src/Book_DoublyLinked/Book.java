package Book_DoublyLinked;

public class Book 
{
	int bookid;	
	String title;
	double price;
	
	public Book()
	{
		bookid=12;	
		title="Abhi ki kahani";
		price=2131.21;
	}


	public Book(int bookid, String title, double price) 
	{
		this.bookid = bookid;
		this.title = title;
		this.price = price;
	}

	public int getBookid()
	{
		return bookid;
	}
	public void setBookid(int bookid)
	{
		this.bookid=bookid;
	}

	public String gatTitle()
	{
		return title;
	}
	public void setTitl(String title)
	{
		this.title=title;
	}

	public double gatPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}

	@Override
	public String toString() 
	{
		return "Book [bookid=" + bookid + ", title=" + title + ", price=" + price + "]";
	}
	
}
