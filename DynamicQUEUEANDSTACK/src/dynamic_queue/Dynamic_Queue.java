package dynamic_queue;

public class Dynamic_Queue {

	Node front,rear;
	
	public Dynamic_Queue()
	{
		front=rear=null;
	}
	
	public Boolean isEmpty()
	{
		return front==null;
	}
	public void Enqueue(int data) 
	{
		Node record = new Node(data);
		if(front==null && rear==null)
		{
			front=rear=record;
		}
		else 
			rear.setNext(record);
		  //  rear= rear.getNext();
		   rear=record;
	}
	
	public int Dequeue() 
	{
		int data =-999;
		if(!isEmpty())
		{
			data=front.getData();
			if(front==rear)
			{
				front=rear=null;
			}
			else
				front=front.getNext();
		}
		return data;
	}
	
	public void display()
	{
		Node move;
		for(move=front;move!=null;move=move.getNext())
		{
		System.out.println("  "+move.getData());	
		}
	}
}
