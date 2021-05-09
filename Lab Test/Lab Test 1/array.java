/*2. WAP to accept number from user(Scanner class) print table of it
	5*1=5
	5*2=10
	5*3=15
	5*4=20
import java.util.Scanner;
class table
{
	
	public static void main(String args[])
	{
		System.out.println("Enter number for Table");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		 for(int i=1;i<=10;i++)
			{	int ans= a*i;
				System.out.println(a+"*"+i+"="+ans);
			}	
				
	}
}
*/

/*3.WAP to swap 2 numbers and display it before swap and after swap.
import java.util.Scanner;
class swap
{
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		int a = sc.nextInt();
		System.out.println("Enter number 2");
		int b = sc.nextInt();
		System.out.println("before swap");
		System.out.println("number 1 = "+a);
		System.out.println("number 2 = "+b);
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swap");
		System.out.println("number 1 = "+a);
		System.out.println("number 2 = "+b);
		
		
				
	}
}*/

/*4.WAP to check whether a number given is even or odd
import java.util.Scanner;
class oddeven
{
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int a = sc.nextInt();
		System.out.println("0 and 1 is not  even");
		if(a%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
	}
}*/

/*5.WAP to accept an array and display it in reverse form
import java.util.Scanner;
class array
{
	
	public static void main(String args[])
	{
		int arr[]=new int[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		
		for (int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}	
		for (int j=arr.length-1;j>=0;j--)
		{
			System.out.println(arr[j]);
		}	
	}
	
}