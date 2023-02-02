package Book_DoublyLinked;

import java.util.Scanner;

public class Book_DLL 
{
	Node head;
	
	public Book_DLL()
	{
		head=null;
	}
	
	public void add(Book data)
	{
		Node move;
		Node record=new Node(data);
		
		if(head==null)
		{
			head=record;
		}
		else
		{
			move=head;
			while(move.next!=null)
				move=move.next;
		record.prev=move;
		move.next=record;
		}	
	}
	public void modify(int bid)
	{
		
		Scanner sc = new Scanner(System.in);
		Node move;
		boolean flag=false;
		for(move=head;move!=null;move=move.next)
		{
			if(move.data.bookid==bid)
			{
				System.out.println("Enter new data: ");
			flag=true;
		System.out.println("Enter Bookid: ");
		int bookid=sc.nextInt();
		System.out.println("Enter Title: ");
		String title=sc.next();
		System.out.println("Enter Price: ");
		double price=sc.nextDouble();
		
		Book b1=new Book(bookid,title,price);
		move.data=b1;
			}
		}
		if(flag==false)
			System.out.println("Data not found");
	
	}
	public void del_begDLL(int data)
	{
		System.out.println("Delete node ");
		Node del;
		if(head.data.bookid==data)
		{
			del=head;
			head=head.next;
			head.prev=null;
	
			del=null;
			
		}
		
	}
	
	//public void Del_mid(int data)
	public void display()
	{
		Node move;
		if(head==null)
		{
			System.out.println("linked list is empty");
	       return;
		}
		for(move=head;move!=null;move=move.next) {
			
			System.out.println(" "+move.data);
	     
		}
	}
}
