package March_5;

import java.util.Scanner;

public class SwapNumbers 
{
	static int a,b;
	
	public void Swap(int a, int b)
	{
		a = a - b;//temporary value of a will be 10 (25-15)
        b = a + b;//value of a goes to b (10+15)
        a = b - a;//value of b goes to a (25-10)

        System.out.println("<<After Swapping>>");
        System.out.println("Value of a is");
        System.out.println(a);
        System.out.println("Value of b is");
        System.out.println(b);
	}
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Value of a is");
        a = obj.nextInt();
        System.out.println("Value of b is");
        b = obj.nextInt();   
        SwapNumbers num = new SwapNumbers();
        num.Swap(a, b);       
    }
}
