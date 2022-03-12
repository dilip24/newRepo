package day7;

import java.util.Scanner;

public class Expression 
{
	public float sum(float a, float b)
	{
		float c = a+b;
		return c;
	}
	public int sub(float i, float j)
	{
		int k = (int) (i-j);
		return k;
	}
	public float mul(float a1, int a2)
	{
		float a3 = a1*a2;
		return a3;
	}
	public int div(float x, int y)
	{
		int z = (int) (x/y);
		return z;
	}
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		Expression exp = new Expression();
		System.out.println("Enter the value of x1 & x2");
		float x1 = obj.nextFloat();
		float x2 = obj.nextFloat();
		float SumResult = exp.sum(x1,x2);
		System.out.println("Sum Result is "+SumResult);
		System.out.println("Enter the value of x3");
		float x3 = obj.nextFloat();
		int SubResult = exp.sub(SumResult,x3);
		System.out.println("Sub Result is "+SubResult);
		System.out.println("Enter the value of x4");
		int x4 = obj.nextInt();
		float SumResult2 = exp.sum(SubResult,x4);
		System.out.println("Sum 2 Result is "+SumResult2);
		System.out.println("Enter the value of x5");
		int x5 = obj.nextInt();
		float MulResult = exp.mul(SumResult2,x5);
		System.out.println("Multiplication Result is "+MulResult);
		System.out.println("Enter the value of x6");
		int x6 = obj.nextInt();
		int DivResult = exp.div(MulResult,x6);
		System.out.println("Final result is "+DivResult);
		/*System.out.println("Enter username");
		String userName = obj.nextLine();
		System.out.println("Username is: " + userName);*/
	}

}
