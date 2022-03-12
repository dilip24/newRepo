package Day2;

public class Expression2
{
	public int sum (int a, int b) 
	{
		int c = a+b;
		return c;
	}
	public int sub (int x, int y) 
	{
		int z = x-y;
		return z;
	}
	public int multi (int m1, int m2) 
	{
		int m3 = m1*m2;
		return m3;
	}
	public void div (int i, int j) 
	{
		int k = i/j;
		System.out.println("Division or Final result is "+k);
	}
	public static void main(String[] args)
	{
		Expression2 calc = new Expression2();
		int multiResult1 = calc.multi(10, 2);
		System.out.println("Multiplication1 result is "+multiResult1);
		int subResult = calc.sub(multiResult1, 2);
		System.out.println("Sub result is "+subResult);
		int multiResult2 = calc.multi(subResult, 2);
		System.out.println("Multiplication2 result is "+multiResult2);
		int sumResult = calc.sum(multiResult2, 2);
		System.out.println("Sum result is "+sumResult);
		calc.div(sumResult, 2);
	}
}