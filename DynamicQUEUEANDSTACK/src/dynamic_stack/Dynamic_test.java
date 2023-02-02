package dynamic_stack;

public class Dynamic_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dynamic_stack d1 = new Dynamic_stack();
		d1.push(10);
		d1.push(20);
		d1.push(30);
		d1.push(40);
		System.out.println(" push data in stack is =");
		d1.display();
		
		System.out.println(" After deleting data , stack is =");
		d1.pop();
		d1.display();
	
	}

}
