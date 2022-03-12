package day6;

//method overloading with different output type
public class Static_Polymorphism2 
{
	public int arithmetic(int a, int b, float c)
	{
		float d = a+b+c;
		System.out.println("The result of addition is "+d);
		return (int) d;
	}
	public void arithmetic(float a, float b)
	{
		int c = (int) (a/b);
		System.out.println("The result of division is "+c);
	}
	public static void main(String[] args)
	{
		Static_Polymorphism2 obj = new Static_Polymorphism2();
		float e = obj.arithmetic(15,25,35.5F);
		obj.arithmetic(e,3.5F);
	}
}
