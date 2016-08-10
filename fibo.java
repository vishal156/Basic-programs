//Fibonacci series

import java.util.Scanner;
class fibo
{
	public static void main(String args[])
	{
		int a=0,b=1,c,i,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of element you want in fibonacci series : ");
		n=sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(i=0;i<n-2;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
		
