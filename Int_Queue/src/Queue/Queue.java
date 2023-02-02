package Queue;

public class Queue 
{
	int rear,front;
	int size;
	int arr[];
	
	public Queue()
	{
		front=-1;
		rear=-1;
		size=5;
		arr=new int[size];
	}
	
	public Queue(int size)
	{
		front=rear=-1;
		this.size=size;
		arr=new int[size];
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
	public void enQueue(int n)
	{
		if(!isFull())
		{
			if(front==-1)
			{
				front=0;
			}
			rear++;		
			arr[rear]=n;
		}
		else
			System.out.println("Queue is Empty!!!");
	}
	public int deQueue()
	{
		int data=-9999;
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
			{
				System.out.println("Queue is Empty!!!");
			}
			for(int i=front;i<=rear;i++)
			{
				System.out.println(" "+arr[i]);
			}
			
		}
	}
	
}
