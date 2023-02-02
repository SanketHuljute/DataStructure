package linkedList;

import java.util.Scanner;

import linkedList_Q2.Node;

public class Linked_list 
{
	Node head;
	
	public Linked_list()
	{
		head=null;
	}
	
	
	public Node getHead()
	{
		return head;
	}
	
	public void setHead(Node head)
	{
		this.head=head;
	}
	public void add(int data)
	{
		Node move;
		
		Node record=new Node(data);
		if(head==null)
			head=record; // refere to new node
		else
		{
			move=head;
			while(move.next!=null)
				move=move.next;
			move.next=record; 
		}
	}
	
//	public void create_linked_list (int data)
//	{
//		int no=2;
//		for(int i=1;i<=data;i++) 
//		{
//			add(no);
//			no=no+2;
//		}
//	}
	
	public void create_linked_list (int data)
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
		for(int i=1;i<=data;i++) 
		{
			int no=sc.nextInt();
			add(no*2);
			
		}
	}
	public void leftrotate(int pos )
	{      Node move;
	
		for(move=head;move.next!=null;move=move.next);
		Node  tag = head;
		for(int i=1;i<pos;i++)
		{
			
			move.next=tag;
			tag=tag.next;
			
		}
	}
	public void display()
	{
		Node move;
		for(move=head;move!=null;move=move.next)
		{
			System.out.println(" "+move.data);
		}
	}
}
