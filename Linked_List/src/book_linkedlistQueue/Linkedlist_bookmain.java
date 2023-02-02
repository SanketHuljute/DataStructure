package book_linkedlistQueue;

import java.util.Scanner;

public class Linkedlist_bookmain {

	public static void main(String[] args) 
	{
		Linkedlist_book b=new Linkedlist_book();
		Scanner sc =new Scanner(System.in);
		
		int ch;
		do 
		{
			System.out.print("1.Add data:     \n2.Display data:      \n3.Modify:    \n4. delete at begining");    
					
		
		
			System.out.println("\nEneter your choice: ");
			 ch=sc.nextInt();
			 
			 switch(ch)
			 {
			 case 1 : 
				 System.out.println("Enter the Bookid: ");
				 int bookid=sc.nextInt();
				 
				 System.out.print("Enter the Title: ");
				 String title=sc.next();
				 
				 System.out.println("Enter the Price: ");
				 double price=sc.nextDouble();
				 
				 Book b1=new Book(bookid,title,price);
				 b.add(b1);
				 break;
				 
			 case 2:
				 b.display();
				 System.out.println();
				 break;
						 
			 }
		}
		while(ch!=0);

	}

}
