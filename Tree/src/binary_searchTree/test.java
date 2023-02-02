package binary_searchTree;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_searchtree b1 = new Binary_searchtree();
		b1.addNode(50);
		b1.addNode(70);
		b1.addNode(10);
		b1.addNode(40);
		b1.addNode(80);
		b1.addNode(110);
		b1.addNode(100);
		b1.addNode(30);
		b1.addNode(20);
		b1.addNode(150);
		
		b1.display();
		//b1.inorder(b1.root);
//		System.out.println(" find the data in tree found / not");
		System.out.println("\n========================================================");
//		b1.searchNode(80);
		b1.delete_Node(80);
		//b1.inorder(b1.root);
		b1.display();
		System.out.println("\n==============================================================");
		b1.Findmax();
		System.out.println("==============================================================");
		b1.Findmin();
		
		System.out.println("==========================Height=======================");
		System.out.println("height of tree is "+b1.height(b1.root));
		
		System.out.println(" Count is: "+b1.countnode());
	}

}
