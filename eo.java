//Check even odd number

import java.util.Scanner;
class eo
{
	public static void main(String args[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		a=sc.nextInt();
		if(a%2==0 && a>0)
		{
			System.out.print("The number is even :) ");
		}
		if(a%2==1 && a>0)
		{
			System.out.print("The number is odd :( ");
		}
		if(a<0)
		{
			System.out.print("The number is invalid!!! :) ");
		}
		
	}
}
		
