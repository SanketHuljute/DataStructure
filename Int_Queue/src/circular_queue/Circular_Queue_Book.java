package circular_queue;



public class Circular_Queue_Book 
{
	int front,rear,size;
	Book [] arr;

public Circular_Queue_Book()
{
	front=rear=-1;
	size=1;
	arr=new Book[size];
}
public Circular_Queue_Book(int size)
{
	front=rear=-1;
	this.size=size;
	arr=new Book[size];
}

public boolean isFull()
{
	return front==(rear+1)%size;
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
		{
			front=0;
		}
		rear=(rear+1)%size;
		arr[rear]=data;
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
		 front=(front+1)%size;
	}
	return data;
}

public void display()
{
	int i;
	if(isEmpty())
	{
		System.out.println("Queue is Empty");
	}
	System.out.println("Front: "+front);
	for(i=front;i!=rear;i=(i+1)%size)
	{
		System.out.println(" "+arr[i]);
	}
	if(rear==i)
	{
		System.out.println(" "+arr[i]);
	}
}
}