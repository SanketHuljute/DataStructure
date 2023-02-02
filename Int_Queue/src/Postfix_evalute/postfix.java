package Postfix_evalute;

import java.util.Scanner;
import java.util.Stack;

public class postfix {

	
	
	public static int evaluate(String str1)
	{
		int res=0;
		Scanner sc=new Scanner(System.in);
		Stack s1= new Stack();
		int n;
		char ch;
		for(int i=0;i<str1.length();i++)
		{
			ch =str1.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='a'&&ch<='z')
			{
			System.out.println("Enter value for "+ch);
			n = sc.nextInt();
			s1.push(n);
			}
			else
			{
	        int no1=  (int) s1.pop();
			int no2= (int) s1.pop();
		
			switch(ch)
			{
			case '+':
				res=no2+no1;
				break;
			
			case '-':
			
				res=no2-no1;
				break;
			
			case '*':
				res=no2*no1;
				break;
				
			case '/':
				
				res=no2/no1;
				break;
			
			}
			s1.push(res);
			}
		}
		return res ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner sc= new Scanner(System.in);
	
		String str=sc.next();
		System.out.println(" "+evaluate(str));

	}

}
