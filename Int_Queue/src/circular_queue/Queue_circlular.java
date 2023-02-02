package circular_queue;

public class Queue_circlular {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Queue_circular q = new Queue_circular();
		q.enQueue("Seeta");
		q.enQueue("Meena");
		q.enQueue("Geeta");
		q.enQueue("Reeta");
		q.enQueue("Seeta");
		System.out.println("Circular queue: ");
		q.display();
		
		q.deQueue();
		q.deQueue();
		q.enQueue(" Ram");
		q.enQueue("Sham");
		System.out.println("Circular queue & after Enqueue: ");
		q.display();
		
		

	}

}
