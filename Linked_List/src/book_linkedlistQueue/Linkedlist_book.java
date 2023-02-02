package book_linkedlistQueue;

import java.util.Scanner;

public class Linkedlist_book 
{
	Node head;
	
	public Linkedlist_book()
	{
		head=null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public void add(Book data)
	{
		Node move;
		Node newnode= new Node(data);
		if(head==null)
		{
			head=newnode;
		}
		else
		{	move=head;
		while(move.next!=null)
			move=move.next;
		move.next=newnode;
		}
	}
	
	public void modify(int bid)
	{
		Node move;
		Scanner sc = new Scanner(System.in);
		for(move=head;move!=null;move=move.next)
		{
			if(move.data.getBookid()==bid)
			{
				
				
			}
		}
		
		
	}
	
	public void display()

    {
		Node move;
		if(head==null)
		{
			System.out.println("Queue is null!!");
		}
		for( move=head;move!=null;move=move.next)
		{
			System.out.print(" "+move.data);
		}
    }
}
	

