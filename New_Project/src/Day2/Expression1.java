package Day2;

public class Expression1
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
		Expression1 calc = new Expression1();
		int sumResult1 = calc.sum(10, 2);
		System.out.println("Sum1 result is "+sumResult1);
		int sumResult2 = calc.sum(sumResult1, 2);
		System.out.println("Sum2 result is "+sumResult2);
		int subResult = calc.sub(sumResult2, 2);
		System.out.println("Sub result is "+subResult);
		int multiResult = calc.multi(subResult, 2);
		System.out.println("Multiplication result is "+multiResult);
		calc.div(multiResult, 2);
	}
}
