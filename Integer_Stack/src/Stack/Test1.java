package Stack;

import java.util.Scanner;

public class Test1 
{

	public static int prime(int n)
	{
		int res=n;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				res=-1;
				break;
			}
		}
		
		return res;
	}
	
	public static void primenum(int start,int end)
	{
		Stack primenumber = new Stack(10);
		for(int i=start ;i<end ;i++)
		{
			if(i== prime(i))
			{
				primenumber.push(i);
			}
			
		}
		primenumber.display();
	}
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter start value and end value");
		int start = sc.nextInt();
		int end = sc.nextInt();
		primenum(start,end);
	}
     
}
