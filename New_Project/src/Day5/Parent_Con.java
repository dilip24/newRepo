package Day5;

public class Parent_Con 
{
	public Parent_Con()
	{
		this(33,66,99);
		System.out.println("Parent default constructor");
	}
	
	public Parent_Con(int a)
	{
		this(30,60);
		System.out.println("Parent 1 parametrized constructor");
	}
	public Parent_Con(int a, int b)
	{
		this();
		System.out.println("Parent 2 parametrized constructor");
	}
	public Parent_Con(int a, int b, int c)
	{
		System.out.println("Parent 3 parametrized constructor");
	}

}
