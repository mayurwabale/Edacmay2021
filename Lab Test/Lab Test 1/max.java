//6.WAP to illustrate condition operator to find maximum among 2or 3 numbers
import java.util.Scanner;
class max
{
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 ");
		int a = sc.nextInt();
		System.out.println("Enter number 2 ");
		int b = sc.nextInt();
		if(a>b)
		{	
			System.out.println(a+"is max");
		}
		else
		{
			System.out.println(b+"is max");
		}
	}
}
//7.WAP to illustrate example of typecasting 	