package Merge_linkedlist;

public class Linkeedlist_main {

	public static void main(String[] args)
	{
		Linked_list_even l1= new Linked_list_even();
		
		Linked_list_even l2= new Linked_list_even();
		
		Linked_list_even l3= new Linked_list_even();
		
//		System.out.println("Even number: ");
//		l1.createeven(5);
//		l1.display();
//		System.out.println("Odd number: ");
//		l2.createodd(5);
//		l2.display();
//		System.out.println("Merge element: ");
//		l1.merge(l2);
//		l1.display();
		System.out.println("even and odd no.s: ");
		l3.create_linkedlist(5);
		l3.display();
		l3.split_even_odd(l1,l2);
		
		

	}

}
