/*1. WAP to accept 2 numbers from Command line argument and perform its addition and display*/
public class sum
{
	 public static void main(String args[])
	 {
		String s1=args[0];
		String s2=args[1];
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int c = a+b;
		System.out.println("First argument :"+a);
		System.out.println("Second argument :"+b);
		System.out.println("addion of "+a+" and "+b+" is : "+c);
		
	 }
}