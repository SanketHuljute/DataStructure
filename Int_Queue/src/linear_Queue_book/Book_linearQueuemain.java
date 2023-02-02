package linear_Queue_book;

import java.util.Scanner;

public class Book_linearQueuemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book_linerQueue b1 = new Book_linerQueue();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size=sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the bookId: ");
			int bookid=sc.nextInt();
			
			System.out.println("Enter the Title: ");
			String title=sc.next();
			
			System.out.println("Enter the price: ");
			double price=sc.nextDouble();
			
			Book b2 = new Book(bookid,title,price);
			
			b1.enQueue(b2);
		}
			b1.display();
	}

}
