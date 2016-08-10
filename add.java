import java.util.Scanner;
class add
{
	public static void main(String args[])
	{	
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the 1st number : ");
		a=sc.nextInt();
		System.out.print("Enter the 2nd number : ");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Sum : "+c);
	}
}
