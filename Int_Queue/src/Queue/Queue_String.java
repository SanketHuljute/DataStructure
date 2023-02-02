package Queue;

public class Queue_String 
{
	int rear,front;
	int size;
	String arr[];
	public Queue_String()
	{
		rear=front=-1;
		size=5;
		arr=new String[size];
	}
	
	public Queue_String(int size)
	{
		rear=front=-1;
		this.size=size;
		arr=new String[size];
	}
	
	public boolean isEmpty()
	{
		if(front==-1)
			return true;
		else
			return false;
	}
	
	public boolean isFull()
	{
		if(rear==size-1)
			return true;
		else
			return false;
	}
	
	public void enQueue(String str)
	{
		if(!isFull())
		{
			if(front==-1)
			{
				front=0;
			}
			rear++;
			arr[rear]=str;
		}
		else
			System.out.println("Queue is Empty!!!");		
	}
	
	public String deQueue()
	{
		String data=null;
		if(!isEmpty())
		{
			data=arr[front];
			if(front==rear)
			{
				front=rear=-1;
			}
			else
				front++;
		}
		
		return data;
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty!!!");
		}
		for(int i=front;i<=rear;i++)
		{
			System.out.println(" "+arr[i]);
		}
	}

}	
