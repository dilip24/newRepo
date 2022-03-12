package Day3;

public class Constructor {
	
	public Constructor()
	{
		this(11,22,33);
		System.out.println("This is default constructor");
	}	
	public Constructor(int a)
	{
		this(10,20,30,40);
		System.out.println("This is one parametrized constructor");
	}	
	public Constructor(int a, int b)
	{
		this();
		System.out.println("This is two parametrized constructor");
	}	
	public Constructor(int a, int b, int c)
	{
		System.out.println("This is three parametrized constructor");
	}	
	public Constructor(int a, int b, int c, int d)
	{
		this(100,200);
		System.out.println("This is four parametrized constructor");
	}	
	public static void main(String[] args)
	{
		Constructor con = new Constructor(111);
	}
}
