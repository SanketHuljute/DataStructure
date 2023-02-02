package DLL;


import java.util.Scanner;

public class Linked_listDLL {
Node head;
	
	public Linked_listDLL()
	{
		head=null;
	}
	
	public void add(int data)
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
	public void modify(int data)
	{
		
		Scanner sc = new Scanner(System.in);
		Node move;
		boolean flag=false;
		for(move=head;move!=null;move=move.next)
		{
			if(move.data==data)
			{
				System.out.println("Enter new data: ");
			flag=true;
		System.out.println("Enter Bookid: ");
		int newdata=sc.nextInt();
		
		move.data=newdata;
			}
		}
		if(flag==false)
			System.out.println("Data not found");
	
	}
	public void del_begDLL(int data)
	{
		System.out.println("Delete node ");
		Node del;
		if(head.data==data)
		{
			del=head;
			head=head.next;
			head.prev=null;
	
			del=null;
			
		}
	}
		public void del_midDLL_last(int data)
		{
			Node move= head;
			Node del;
			while(move.next!=null)
			{
				if(move.next.data==data)
				{
					del=move.next;
				
				if(del.next!=null)
				{
					del.next.prev=move;
				}
					move.next=del.next;
				}
			move=move.next;
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
