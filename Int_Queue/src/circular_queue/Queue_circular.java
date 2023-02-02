package circular_queue;

public class Queue_circular
{
	int front,rear,size;
	String [] arr;
	
	public Queue_circular()
	{
		front=rear=-1;
		size=5;
		arr=new String[size];
	}
	
	public Queue_circular(int size)
	{
		front=rear=-1;
		this.size=size;
		arr=new String[size];
	}
	
	public boolean isFull()
	{
		return front==(rear+1)%size;
	}
	
	public boolean isEmpty()
	{
		return front==-1;
	}
	
	public void enQueue(String str)
	{
		 if(!isFull())
		 {
			 if(front==-1)
			 {
				 front=0;
			 }
			 rear=(rear+1)%size;
			 arr[rear]=str;	 
		 }
		 else
			 System.out.println("Stack is full!!");
//		 deQueue();
//		 enQueue(str);
		 }
	
	public void deQueue()
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
			front=(front+1)%size;
		}
	}
	
	public void display()
	{
		int i;
		if(isEmpty())
		{
			System.out.println("Stack is Empty!!!");
		}
		System.out.println("Front: "+front);
		for(i=front;i!=rear;i=(i+1)%size)
		
			System.out.println(" "+arr[i]);
		
		if(i==rear)
			System.out.println(" "+arr[i]);
		System.out.println();
		System.out.println("Rear: "+rear);
	}
	
}
