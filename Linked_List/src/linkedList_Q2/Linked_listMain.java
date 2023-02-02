package linkedList_Q2;

public class Linked_listMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Linked_list l=new Linked_list();
                                                                                               
		l.create_linkedlist(10);
		l.leftrotate(2);
//		l.addbeg(100);
//		l.addend(200);
////		l.Addend(200);
////		l.del_beg();	
//	l.del_beg();
		l.display();
		
		System.out.println("Reverse LinkedList: ");
//		l.Reverse();
		l.Recursion_reverse(l.head);
//		l.display();
                                                                                                                   
	}

}
