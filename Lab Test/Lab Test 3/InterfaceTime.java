import java.util.Scanner;

interface DisplayTime
{
	void disp_TimeInSec();
	void disp_TimeInHr();
}

class TimeMin implements DisplayTime{
	int t;
	Scanner sc = new Scanner(System.in);
	void acceptMin()
	{
		System.out.println("Enter time in minute");
		t=sc.nextInt();
	}
	@Override
	public void disp_TimeInSec() {
		// TODO Auto-generated method stub
		int a;
		a=t*60;
		System.out.println("time in sec = "+a);
	}
	@Override
	public void disp_TimeInHr() {
		// TODO Auto-generated method stub
		float b;
		b=t/60f;
		System.out.println("time in hr = "+b);
	}
	
	
}


public class InterfaceTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TimeMin timemin = new TimeMin();
		timemin.acceptMin();
		timemin.disp_TimeInSec();
		timemin.disp_TimeInHr();
	}

}
