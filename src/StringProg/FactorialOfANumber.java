package StringProg;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) 
	
	{
		for(; ;)
		{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		for(int i=n;i>=1;i--)
		{	
			fact=fact*i;
		}
		System.out.println(fact);
		}
	}
}
