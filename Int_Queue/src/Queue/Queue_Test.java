package Queue;

public class Queue_Test {

	public static void main(String[] args) {
		Queue q1 = new Queue();
		Queue q2 = new Queue(8);
		
		q1.enQueue(10);
		
		q1.enQueue(20);
		q1.enQueue(30);
		q1.enQueue(40);
		q1.enQueue(50);
		System.out.println("EnQueue data:");
		q1.display();
		
		q1.deQueue();
        q1.deQueue();
        System.out.println("DeQueue data:");
        q1.display();
        
	}

}
