
public class Main {

	public static void main(String[] args)
	{
		Calculator.powerInt(2, 3);
		Calculator.powerDouble(2.5, 3.2);
	}
}
////////////////////////////////////////////

public class Calculator {
	public static void powerInt(int n1,int n2)
	{
		double x=n1,y=n2;
		int k = (int)Math.pow(x, y);
		System.out.println(k);
	}
	public static void powerDouble(double d1,double d2)
	{
		
		int k =(int)Math.pow(d1, d2);
		System.out.println(k);
	}

}
