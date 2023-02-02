 package string;

public class Stack {

	int size ,top;
	String arr[];
	public Stack()
	{
		size=5;
		top=-1;
		arr= new String [size];
	}
	public Stack(int size)
	{
		top=-1;
		this.size=size;
		arr= new String[size];
	}
	public boolean  isFull()
	{
		if(top==size-1)
		    return true;
		else 
			return false;
	}
	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
		
	public void push (String data)
	{
		if(!isFull())
			arr[++top]=data;
		else
			System.out.println("Stack is Full");
	}
	public String pop()
	{
		String data=null;
		if(!isEmpty())
		{
			data=arr[top--];
		}
		return data;
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty!!!!");
		}
		
		for(int i=top ;i>=0; i--)
			System.out.println(" "+arr[i]);
	}
	
}		




























	