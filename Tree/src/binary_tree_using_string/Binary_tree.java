package binary_tree_using_string;

import java.util.Scanner;

public class Binary_tree 
{
	Node root;
	
	public Binary_tree()
	{
		root=null;
	}
	
	
	public Node getRoot() {
		return root;
	}


	public void setRoot(Node root) {
		this.root = root;
	}


	public void addNode(String data)
	{
		Scanner sc = new Scanner(System.in);
		Node record= new Node(data);
		
		if(root==null)
		{
			root=record;
		System.out.println("Root created: ");
		}
		else
		{
			Node move=root;
			while(true)
			{
				System.out.println("Enter the string left/right ");
				String ans=sc.next();
				if(ans.equals("left"))
				{
					if(move.left==null)
					{
						move.left=record;
						break;
					}
					else
					{
						move=move.left;
					}
				}
					else if(ans.equals("right"))
					{
						if(move.right==null)
						{
							move.right=record;
							break;
						}
						else
						{
							move=move.right;
						}
					}
					
					else
					{
						System.out.println("Invalid Input");
					}
					
				}
			}
	}	
		public void inorder(Node root)
		{
			if(root!=null)
			{
				inorder(root.left);
				System.out.println(" "+root.data);
				inorder(root.right);
			}
		}
		
		public void preorder(Node root)
		{
			if(root!=null)
			{
				System.out.println(" "+root.data);
				inorder(root.left);
				inorder(root.right);
			}
		
		}
		
		public void postorder(Node root)
		{
			if(root!=null)
			{
				
				inorder(root.left);
				inorder(root.right);
				System.out.println(" "+root.data);
			}
		
		}
		
			
			
		
	}

