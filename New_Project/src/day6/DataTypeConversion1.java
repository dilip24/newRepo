package day6;

public class DataTypeConversion1
{
	public void implicitcall(char a)
	{
		int b = a;//big data type stores small data type
		System.out.println("Implicit conversion (char to int)");
		System.out.println("Result is "+b);
	}
	public void implicitcall(int a)
	{
		float b = a;//big data type stores small data type
		System.out.println("Implicit conversion (int to float)");
		System.out.println("Result is "+b);
	}
	public void explicitcall(float a)
	{
		int b = (int) a;//small data type stores big data type
		System.out.println("Explicit conversion (float to int)");
		System.out.println("Result is "+b);
	}
	public void explicitcall(int a)
	{
		char b = (char) a;//small data type stores big data type
		System.out.println("Explicit conversion (int to char)");
		System.out.println("Result is "+b);
	}	
	public static void main(String[] args)
	{
		DataTypeConversion1 obj = new DataTypeConversion1();
		obj.implicitcall('J');
		obj.implicitcall(99);
		obj.explicitcall(24.5F);
		obj.explicitcall(72);
	}
}
