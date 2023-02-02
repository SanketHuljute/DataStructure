package DLL;

import java.util.Scanner;

import Book_DoublyLinked.Book;

public class DLL_main {

	public static void main(String[] args) {
	Linked_listDLL l1 = new Linked_listDLL();
	Scanner sc = new Scanner(System.in);
	int ch;
	do {
		System.out.println("1.Add   \n2.display     \n3.modify  \n4.delete first node \n5.delete mid & last position node ");
		
		
		System.out.println("Enter your choice");
		 ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
		
	
	System.out.println("Enter the data");
	int data=sc.nextInt();
	
	l1.add(data);
	
	break;
		case 2:
		l1.display();
		break;
		case 3:
			System.out.println("enter the newdata");
			int data2 = sc.nextInt();
			l1.modify(data2);
			break;
		case 4:
			System.out.println("enter the data which you want to delete");
			int data1 = sc.nextInt();
			l1.del_begDLL(data1);
			break;
		case 5:
			System.out.println("enter the data any specific position which you want to delete");
			int data3 = sc.nextInt();
			l1.del_midDLL_last(data3);
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
