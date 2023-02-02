package DLL;

public class Node 
{
	Node prev,next;
	int data;
	
	public Node()
	{
		prev=null;
		next=null;
	}
	
	public Node(int data)
	{
		prev=next=null;
		this.data=data;
	}
	
	public int getData()
	{
		return data;
	}
	public void setData(int data)
	{
		this.data=data;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
}
