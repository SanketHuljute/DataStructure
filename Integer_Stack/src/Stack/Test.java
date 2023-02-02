package Stack;

 public class Test {
	
 public static void main(String [] args)
 {
 	Stack s1 = new Stack(7);
 	
 	s1.display();
 	s1.push(100);
 	s1.push(43);
 	s1.push(54);
 	s1.push(566);
 	s1.push(2344);
 	s1.pop();
 	s1.pop();
 	s1.pop();
 	s1.pop();
 }

}






























//public class Stack {
//	int size,top;
//	int arr[];
//	public Stack()
//	{
//		size=5;
//		top=-1;
//		arr=new int[size];
//	}
//	public Stack(int size)
//	{
//		top=-1;
//		this.size=size;
//		arr=new int[size];
//	}
//	public boolean isFull()
//	{
//		if(top==size-1)
//			return true;
//		else
//			return false;
//	}
//	public boolean isEmpty()
//	{
//		if(top==-1)
//			return true;
//		else
//			return false;
//	}
//	public void Push(int data)
//	{
//		if(!isFull())
//			arr[++top]=data;
//		else
//			System.out.println("Stack Is Full ");
//	}
//	public int Pop()
//	{
//		int data=-9999;
//		if(!isEmpty())
//		{
//			data=arr[top--];
//		}
//		return data;
//	}
//	public void display()
//	{
//		if(isEmpty())
//		{
//			System.out.println("Stack Is empty !!! ");
//			return ;
//		}
//	    System.out.println(" ************* Stack Is **************");
//	    for(int i=top;i>=0;i--)
//	    	System.out.println("   "+arr[i]);
//	}
//}
