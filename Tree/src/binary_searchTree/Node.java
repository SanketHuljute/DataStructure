package binary_searchTree;

public class Node 
{
	int data;
	Node left,right;
	
	public Node()
	{
	data=10;
	left=right=null;
	}
	
	public Node(int data)
	{
		this.data=data;
		left=right=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
	
	}
