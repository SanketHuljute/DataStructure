package linkedList_Q2;

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
	
	public void setHead()
	{
		this.head=head;
	}
	
	public void add(int data)
	{
		Node move;
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			move=head;
			while(move.next!=null) // 
			{
				move=move.next; // Loop run until value of move.next = next ,when it's find then condition false and loop break and go outside the loop 
			}
			move.next=newnode;
		}
	}
	
	public void create_linkedlist(int n)
	{
		int no=10;
		for(int i=1;i<=n;i++)
		{
			add(no);
			no=no+10;
		}
	}
	
	public void addbeg(int n)
	{
		Node newnode=new Node(n);
		newnode.next = head;
		head = newnode;
	}
	
	public void addend(int n)
	{
		Node newcord=new Node(n);
		Node move=head;
		for( move=head;move.next!=null;move=move.next);
		
			if(move.next==null)
			{
			move.next=newcord;
			}
		
	}
	public void Addend(int n)
	{
		Node move=head;
		Node newnode=new Node( n);
		while(move.next!=null)
			move=move.next;
	if(move.next==null)
	{
		move.next=newnode;
	}
	}
	
	public void Reverse()
	{
		Node p1,p2,p3;
		p1=head;
		p2=head.next;
		p3=p2.next;
		while(p2!=null)
		{
			p2.next=p1;
			p1=p2;
			p2=p3;
			if(p3!=null)
			{
				p3=p3.next;
			}	
		}
		head.next=null;
		head=p1;
	}
	public void Recursion_reverse(Node head)
	{
		if(head!=null)
		{
			Recursion_reverse(head.next);
			System.out.println(" "+head.data);
		}
	}
	
	public void del_beg()
	{
		 head=head.next;
	}
	
	
	public void leftrotate(int pos )
	{      Node move;
	
		for(move=head;move.next!=null;move=move.next);
		Node  tag = head;
		for(int i=1;i<pos;i++)
		{
			
			move.next=tag;
			move=move.next;
			tag=tag.next;
			
		}
	}
//	public void Del_beg()
//	{
//		Node move=head;
//		 move=move.next;
//	}
	public void display()
	{                                              
		Node move;
		for(move=head;move!=null;move=move.next) // when we apply move.next then we can't get data of last node so we use move!=null move refer to imaginary node 
		{
			System.out.println(" "+move.data);
		}
	}

}
