package Day4;

public class Method_Calling 
{
	public void method1()
	{
		this.method4(2,4,6);;
		System.out.println("This is default method");
		this.method2(25);
		this.method3(5,15);
		this.method5(1,3,5,7);
		this.method6(10,20,30,40,50);
	}	
	public void method2(int a)
	{
		System.out.println("This is one parametrized method");
	}	
	public void method3(int a, int b)
	{
		System.out.println("This is two parametrized method");
	}	
	public void method4(int a, int b, int c)
	{
		System.out.println("This is three parametrized method");
	}	
	public void method5(int a, int b, int c, int d)
	{
		System.out.println("This is four parametrized method");
	}
	public void method6(int a, int b, int c, int d, int e)
	{
		System.out.println("This is five parametrized method");
	}
	public static void main(String[] args)
	{
		Method_Calling obj = new Method_Calling();
		obj.method1();
	}

}
