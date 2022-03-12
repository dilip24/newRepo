package day6;

public class DataTypeConversion2 
{
	public int method1(char a)
	{
		System.out.println("Result of method1 is "+a);
		return a;
	}
	public float method2(int a)
	{
		System.out.println("Result of method2 is "+a);
		return a;
	}
	public int method3(float a)
	{
		System.out.println("Result of method3 is "+a);
		return (int) a;
	}
	public char method4(int a)
	{
		System.out.println("Result of method4 is "+a);
		return (char) a;
	}	
	public static void main(String[] args)
	{
		DataTypeConversion2 obj = new DataTypeConversion2();
		int a = obj.method1('J');
		System.out.println("Return value of method1 is "+a);
		float b = obj.method2(33);
		System.out.println("Return value of method2 is "+b);
		int c = obj.method3(24.5F);
		System.out.println("Return value of method3 is "+c);
		char d = obj.method4(72);
		System.out.println("Return value of method4 is "+d);
	}

}
