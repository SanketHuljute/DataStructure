package dynamic_stack;

public class Dynamic_stack {
   Node top;
   
   public Dynamic_stack()
   {
	   top=null;
   }
   public boolean isEmpty()
   {
	   return top==null;
   }
   
   public void push(int data)
   {
	 
	  Node record = new Node(data);
	  if(top==null)
	  {
		  top=record;
	  }
	  else
		  record.setNext(top);
	     top=record;
   }
   
   public int pop()
   {
	
	   int data=-9999;
	   if(!isEmpty())
	   {
		   data=top.getData();
		   if(top==null)
		   {
			   System.out.println("stack is empty");
		   }
		   else
			   top=top.getNext();
	   }
	  System.out.println("deletd data is "+data);
	   return data;
   }
   
   public void display()
   {
	 Node move;  
	 for(move=top;move!=null;move=move.getNext())
	 {
		System.out.println(" "+move.getData()); 
	 }
   }
}
