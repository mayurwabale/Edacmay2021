import java.util.Scanner;

class Student
{
	int studid;
	String name;
	String div;
	float perc;
	
	Scanner sc = new Scanner(System.in);
	
	Student()
	{

			
			System.out.println("Enter Student ID");
			studid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Student Name");
			name=sc.nextLine();
			System.out.println("Enter Student Division");
			div=sc.nextLine();
					
		
	}
	 
	 
	 void display()
	 {
		 System.out.println("Student ID = "+studid+"Student name = "+name+"Student Division = "+div);
	 }
	 
	 void getinfo(int studid,String name,String div,float perc)
	 {
		 System.out.println("Enter Student ID");
			studid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Student Name");
			name=sc.nextLine();
			System.out.println("Enter Student Division");
			div=sc.nextLine();
			System.out.println("Enter Student percentage");
			perc=sc.nextFloat();
	 }
	 
	 void getinfo(int studid,String name,String div)
	 {
		 System.out.println("Enter Student ID");
			studid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Student Name");
			name=sc.nextLine();
			System.out.println("Enter Student Division");
			div=sc.nextLine();
	 }
	 
	 
	 void display1()
	 {
		 System.out.println("Student ID = "+studid+"Student name = "+name+"Student Division = "+div+"Perc ="+perc);
	 }
	 
	 
	
	 
	
}








public class LabTest {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.display();
		

		Student studentobjects[]=new Student[5];
		
		for(int i=0;i<studentobjects.length;i++)
		{
			studentobjects[i]=new Student();
			studentobjects[i].display();
			
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
