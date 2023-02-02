package Merge_linkedlist;



public class Linked_list_even 
{
	Node head;
	
	public Linked_list_even()
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
	
	public void createeven(int terms)
	{
		int no=0;
		for(int i=1;i<=terms;i++)
		{
			add(no);
			no=no+2;
		}
		System.out.println("list: "+no);
	}
	public void createodd(int terms)
	{
		int no=1;
		for(int i=1;i<=terms;i++)
		{
			add(no);
			no=no+2;
		}
		System.out.println("list: "+no);
	}
	
	public void create_linkedlist(int terms)
	{
		int no=1;
		for(int i=1;i<=terms;i++)
		{
			add(no);
			no++;
		}
		System.out.println("list: "+terms);
	}

	public void split_even_odd(Linked_list_even l1 , Linked_list_even l2)
	{
	       Node move=head;
	       while(move!=null)
	       {
	    	   if((move.data)%2==0)
	    	   {
	    		   l1.add(move.data); 
	    	   }
	    	   else
	    	   {
	    		   l2.add(move.data);	
	    	   }
	    	   move=move.next;
	       }
	       System.out.println(" even no. list ==== ");
	       l1.display();
	       System.out.println(" odd no. list ==== ");
	       l2.display();
	}
	
	public void merge(Linked_list_even l2)
	{
		Node move=head;
		while(move.next!=null)
			move=move.next;
		move.next=l2.getHead();
	}
	


	public void display()
	{                                              
		Node move;
		for(move=head;move!=null;move=move.next) // when we apply move.next then we can't get data of last node so we use move!=null move refer to imaginary node 
		{
			System.out.println(" "+move.data);
		}
	}

}
