import java.lang.Exception;
class Excep
{
	void cal(int a, int b)
	{
		try
		{
			int result = a/b;
			int [] arr = new int[2];
			arr[3]=6;
		}
		
		catch(ArithmeticException e)
		{
			
			System.out.println(e.getMessage());
		}
		
		
		
	}
}



class outofbound
{
	try {
		int [] arr = new int[2];
		arr[3]=6;
		
	}catch(IndexOutOfBoundsException e)
	{
		
		System.out.println(e.getMessage());
	}
	
	
}

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Excep excep = new Excep();
		excep.cal(12, 0);
	}

}
