class Student
{
	int totalmk;
	float result;
	void calcResult(int totalmk)
	
	{
		this.totalmk=totalmk;
		this.result=totalmk/4;
		System.out.println(result);
	}
}

class Marks extends Student{
void calcResult(int a)
	
	{
		
		float result=a/3;
		System.out.println(result);
	}
	
}

class Result extends Marks{
	
void calcResult(int b)
	
	{
		
		float result=b/5;
		System.out.println(result);
	}
}

public class InheritancExample {

	public static void main(String[] args) {
		Student student = new Result();
		student.calcResult(200);
		Student student1 = new Marks();
		student1.calcResult(200);
		Student student2 = new Student();
		
		// TODO Auto-generated method stub

	}

}
