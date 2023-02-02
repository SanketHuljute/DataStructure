package linkedList;

public class Node 
{
	int data;
	Node next;
	
	public Node()
	{
		data=10;
		next=null;
	}
	
	public Node(int data)
	{
		this.data=data;
	     next=null;
	}
	
	public int getData()
	{
		return data;
	}
	public void setData()
	{
		this.data=data;
	}

//	@Override
//	public String toString() {
//		return "Node [head=" + head + ", data=" + data + ", next=" + next + "]";
//	}
	
	@Override
	public String toString()
	{
		return "Data "+data+"Next "+next;
	}
}
