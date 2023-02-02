package book_linkedlistQueue;

public class Node 
{
	Book data ;
	Node next;
	
	public Node()
	{
		data=null;
		next=null;
	}
	
	public Node(Book data)
	{
		this.data=data;
		this.next=null;
	}
	
	
	public Book getData() {
		return data;
	}

	public void setData(Book data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
	
}
