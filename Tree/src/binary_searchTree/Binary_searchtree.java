package binary_searchTree;

public class Binary_searchtree {
	Node root;
	static int cnt=0;
	
	public Binary_searchtree()
	{
		root=null;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	public void addNode(int data)
	{
		cnt++;
		Node record = new Node(data);
		if(root==null)
		{
			root=record;
		}
		else
		{
			 Node move=root;
			 while(true)
			 {
				 if(data<move.data)
				 {
					 if(move.left==null)
					 {
						 move.left=record;
						 break;  
					 }
					 else
						 move=move.left;
				 }
				 else if(data>move.data)
				 {
					 if(move.right==null)
					 {
						 move.right=record;
						 break;
					 }
					 else
						 move=move.right;
				 }
					 
			 }
		}
	}
	
	public void inorder(Node root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.print("  "+root.data);
			inorder(root.right);
		}
	}

	public void preorder(Node root)
	{
		if(root!=null)
		{
			System.out.print("  "+root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	public void postorder(Node root)
	{
		if(root!=null)
		{
			postorder(root.left);
			postorder(root.right);
			System.out.print("  "+root.data);
		}
	}
	
	public void searchNode(int data)
	{
		Node temp=root;
		while(temp!=null)
		{
			Node tag;
			if(data>temp.data)
			{
			 tag=temp;
				temp=temp.right;
			}
			else if(data<temp.data)
			{
				tag=temp;
				temp=temp.left;
			}
			else if(temp.data==data) 
			{
				System.out.println("data found");
				return;
			}
			else
			{
			System.out.println("data not found");
				return;
			}
		}
		
	}
		 public void delete_Node(int data)
		 {	
			 
			 Node temp=root;
			 Node tag=null;
				while(temp!=null)
				{
					
					if(data>temp.data)
					{
					 tag=temp;
						temp=temp.right;
					}
					else if(data<temp.data)
					{
						tag=temp;
						temp=temp.left;
					}
					else if(temp.data==data) 
					{
						System.out.println("data found");
				cnt--;
				
						break;
					}
					else
					{
					System.out.println("data not found");
						return;
					}
				}
			 Node tr = null;
			 if(temp.left==null && temp.right==null)
			 {
				 if(tag.data>temp.data)
					 tag.left=null;
				 if(tag.data<temp.data)
					 tag.right=null;
				 return ;
			 }
			 if(temp.right!=null)
		 {
				 if(temp.left!=null)
				 {
					 for(tr=temp.right;tr.left!=null;tr=tr.left)
					 {
						 tr.left=temp.left;
					 }
				 }
		 
			 else if(temp.data<tag.data)
			 {
				 tag.left=temp.right;
			 }
			 else 
			 {
				 tag.right=temp.right;
			 }
		 }
			 if(temp.left!=null)
			 {
				 if(temp.data<tag.data)
					 tag.left=temp.left;
			 }
	}
		 
		
		 public void Findmax()
		 {
			 Node temp=root;
			for(;temp.right!=null;temp=temp.right);
			System.out.println(" maximum element in tree is "+temp.data);
		 }
		 public void Findmin()
		 {
			 Node temp=root;
			for(;temp.left!=null;temp=temp.left);
			System.out.println(" Minimum element in tree is "+temp.data);
		 }
		 
		/*public int height(Node root)
		{
			int left,right=0;
			int max=0;
			if(root==null)
			{
				this.root=root;
			}
			else
			{
			if(root.left!=null || root.right!=null)
			{
				left=height(root.left);
				right=height(root.right);
				if(left>right)
					 max=left;
				else
					max=right;
			}
			}	
			return max+1;
				
			}
//			if(root!=null)
//			{
//				if(left>right)
//					 max=left;
//				else
//					max=right;
//			}
//			return max+1;
*/
		public int height(Node root) {
			int left=0,right=0,max=0;
			if(root!=null)
				{
			if(root.left!=null)
				 left=height(root.left);
			if(root.right!=null)	
				 right=height(root.right);
		      
					if(left>right)
						 max=left;
					else
						max=right;
				}
				return max+1;
		}
		
		public int countnode()
		{
			Node temp=root;
					for(;temp.left!=null;temp=temp.left,cnt++);
			
			return cnt;
		}
	public void display()   
	{
		
		System.out.println(" inorder************************");
		inorder(root);
		System.out.println(" \npreorder************************");
		preorder(root);
		System.out.println(" \npostorder************************");
		postorder(root);
		
	}
}
