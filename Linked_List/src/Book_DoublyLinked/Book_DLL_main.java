package Book_DoublyLinked;

import java.util.Scanner;

public class Book_DLL_main {

	public static void main(String[] args) {
		Book_DLL b1 = new Book_DLL();
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.Add   \n2.display     \n3.modify  \n4.delete first node \n5.delete position node");
			
			
			System.out.println("Enter your choice");
			 ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
			
		
		System.out.println("Enter the boookid");
		int bookid=sc.nextInt();
		System.out.println("Enter the title");
		String title=sc.next();
		System.out.println("Enter the price");
		double price=sc.nextDouble();
		
		Book b2 = new Book(bookid,title,price);
		b1.add(b2);
		
		break;
			case 2:
			b1.display();
			break;
			case 3:
				System.out.println("enter the bid");
				int bid = sc.nextInt();
				b1.modify(bid);
				break;
			case 4:
				System.out.println("enter the bid");
				int bid1 = sc.nextInt();
				b1.del_begDLL(bid1);
				break;
			default:
				System.out.println("invalid entry");
		       }
			
			
			System.out.println("Enter 0.for exit    \n1.for re-enter the data");
			System.out.println("enter the choice");
	        ch=sc.nextInt();
		}
		while(ch!=0);
		
		
	}
      
}
