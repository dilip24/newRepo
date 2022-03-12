package day6;

//method overloading with same output type
public class Static_Polymorphism1 
{
	public void calculation(int a, int b)
	{
		int c = a+b;
		System.out.println("The result of addition is "+c);
	}
	
	public void calculation(int a, int b, float c)
	{
		int d = (int) (a*b*c);
		System.out.println("The result of multiplication is "+d);
	}
	
	public static void main(String[] args)
	{
		Static_Polymorphism1 obj = new Static_Polymorphism1();
		obj.calculation(15,25);
		obj.calculation(2,4,16.5F);
	}
}
