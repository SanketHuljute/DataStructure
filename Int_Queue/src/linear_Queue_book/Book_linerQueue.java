package linear_Queue_book;

public class Book_linerQueue 
{
	int size,front,rear;
	 Book [] arr;
	public Book_linerQueue ()
	{
		size=5;
		front=rear=-1;
		arr=new Book[size];
	}

	public Book_linerQueue (int size)
	{
		this.size=size;
		front=rear=-1;
		arr=new Book[size];
	}
	public boolean isFull()
	{
		return rear==size-1;
	}
	public boolean isEmpty()
	{
		return front==-1;
	}
	
	public void enQueue(Book data)
	{
		if(!isFull())
		{
			if(front==-1)
			front=0;
			arr[++rear]=data;
		}
		else
			System.out.println("Queue is Full!!");
	}
	public Book deQueue()
	{
		Book data=null;
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
		int i;
		if(isEmpty())
		{
			System.out.println("Queue is Full!!");
		}
		for(i=front;i<=rear;i++)
		{
			System.out.println(" "+arr[i]);
		}
	}
} 
