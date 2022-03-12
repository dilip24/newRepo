package Day5;

//using super and this keyword for constructor calling

public class Child_Con extends Parent_Con
{
	public Child_Con()
	{
		super(24);
		System.out.println("Child default constructor");
	}
	public Child_Con(int a)
	{
		this(15,25,35);
		System.out.println("Child 1 parametrized constructor");
	}
	public Child_Con(int a, int b)
	{
		this(22);
		System.out.println("Child 2 parametrized constructor");
	}
	public Child_Con(int a, int b, int c)
	{
		this();
		System.out.println("Child 3 parametrized constructor");
	}
	public static void main(String[] args)
	{
		Child_Con obj = new Child_Con(16,24);
	}
	
	
}
