package string;

import java.util.Scanner;

public class demoMAin {

	public static void main(String[] args) {
		System.out.println("Enter the cities");
		Stack s=new Stack(10);
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
		String str=sc.next();
		s.push(str);
		}
		s.push("Pune");
		System.out.println("Cities In Array");
		
		s.display();
	}
}
