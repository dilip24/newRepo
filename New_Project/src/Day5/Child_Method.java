package Day5;

//using super and this keyword for method calling

public class Child_Method extends Parent_Method
{
	public void cm1()
	{
		this.pm4(33,66,99);
		super.pm1();
		this.pm3(20,40);
		super.pm2(11);
		System.out.println("Child default method");
		this.cm4(10,20,30);
		this.cm2(24);
		this.cm3(8,16);
	}
	public void cm2(int a)
	{
		System.out.println("Child 1 parametrized method");
	}
	public void cm3(int a, int b)
	{
		System.out.println("Child 2 parametrized method");
	}
	public void cm4(int a, int b, int c)
	{
		System.out.println("Child 3 parametrized method");
	}
	public static void main(String[] args)
	{
		Child_Method obj = new Child_Method();
		obj.cm1();
	}
}
