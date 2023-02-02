package binary_tree_using_string;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_tree b = new Binary_tree();
		
		b.addNode("Sanket");
		b.addNode("Abhi");
		b.addNode("Surya");
//		System.out.println("Inorder");
//		b.inorder(b.getRoot());
//		System.out.println("***************************************");
//		
//		System.out.println("preorder");
//		b.preorder(b.getRoot());
//		System.out.println("***************************************");
//		
		System.out.println("postorder");
		b.postorder(b.getRoot());
		System.out.println("***************************************");
		
		
		

	}

}
