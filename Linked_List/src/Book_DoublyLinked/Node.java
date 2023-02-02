package Book_DoublyLinked;

public class Node 
{
	Node prev,next;
	Book data;
	
	public Node()
	{
		prev=null;
		next=null;
	}
	
	public Node(Book data)
	{
		prev=next=null;
		this.data=data;
	}
	
	public Book getData()
	{
		return data;
	}
	public void setData(Book data)
	{
		this.data=data;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
	
}
