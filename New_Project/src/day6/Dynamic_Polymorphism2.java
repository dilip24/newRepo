package day6;

//method overriding
public class Dynamic_Polymorphism2 extends Dynamic_Polymorphism1
{
	public void Overriding (int a, int b, float c)
	{
		int d = (int) (a*b*c);
		System.out.println("The result of multiplication is "+d);
	}
	public static void main(String[] args)
	{
		Dynamic_Polymorphism2 obj = new Dynamic_Polymorphism2();
		obj.Overriding(5,10,15.5F);
		Dynamic_Polymorphism1 obj1 = new Dynamic_Polymorphism1();
		obj1.Overriding(5,10,15.5F);
	}
}
