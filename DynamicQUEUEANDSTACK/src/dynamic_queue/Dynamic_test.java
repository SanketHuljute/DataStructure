package dynamic_queue;

import java.util.Scanner;

public class Dynamic_test {

	public static void main(String[] args) {
	
		Dynamic_Queue q1 = new Dynamic_Queue();
		
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.Enqueue  \n2.display     \n3.dequeue  ");
			
			
			System.out.println("Enter your choice");
			 ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
			
		
		System.out.println("Enter the data");
		int data=sc.nextInt();
		
		q1.Enqueue(data);
		
						break;
			case 2:
				q1.display();
			break;
			
			case 3:
				q1.Dequeue();
		       break;
			default:
				System.out.println("invalid entry");
		       }
			
			
			System.out.println("Enter 0.for exit    \n1.for re-enter the data");
			System.out.println("enter the choice");
	        ch=sc.nextInt();
		}
		while(ch!=0);
		

	}

}
