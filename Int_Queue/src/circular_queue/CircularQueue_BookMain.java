package circular_queue;

import java.util.Scanner;

public class CircularQueue_BookMain 
{

	public static void main(String[] args) 
	{
	
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size=sc.nextInt();
		Circular_Queue_Book q1 = new Circular_Queue_Book(size);
		Circular_Queue_Book q = new Circular_Queue_Book();
		int choice;
		do 
		{
		System.out.println("1.EnQueue: \n2.DeQueue: \n3.Display \n0:exit: ");
		System.out.println("Enter the choice; ");
		 choice=sc.nextInt();
		
	
		switch(choice) 
		{
		case 1:
		
			System.out.println("Enter the BOOKID: ");
			int bookid=sc.nextInt();
			
			System.out.println("Enter the Title: ");
			String title=sc.next();
			
			System.out.println("Enter the Price: ");
			double price=sc.nextDouble();
			
			Book b1=new Book(bookid,title,price);
			q.enQueue(b1);
		
		case 2:
			q.deQueue();
			break;
			
		case 3:
			q.display();
			break;
			
			default:
		
			System.out.println("Invalid ");
		
		}
		System.out.println("Enter 0 for Exit and 1 number for re-enter");
		choice =sc.nextInt();
			
		}
		while(choice!=0);
		
		
	}

}
