package Queue;

public class QString_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue_String q2=new Queue_String();
		Queue_String q1=new Queue_String(5);
		
		q1.enQueue("Pune");
		q1.enQueue("Delhi");
		q1.enQueue("Mumbai");
		q1.enQueue("Ahmednagar");
		q1.enQueue("Nashik");
		System.out.println("EnQueue Data: ");
		q1.display();
		
		q1.deQueue();
		q1.deQueue();
		System.out.println("DeQueue Data");
		q1.display();

	}

}
