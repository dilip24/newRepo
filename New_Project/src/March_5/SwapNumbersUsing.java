package March_5;

import java.util.Scanner;

public class SwapNumbersUsing 
{
	static int a,b,c;
	
	public void Swap(int a, int b)
	{
		c = a;//Value of a is assigned to c

        a = b;//Value of b is assigned to a

        b = c;//Value of c (storing the initial value of a) is assigned to b

        System.out.println("---After Swapping---");
        System.out.println("Value of a is ");
        System.out.println(a);
        System.out.println("Value of b is ");
        System.out.println(b);
	}
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Value of a is");
        a = obj.nextInt();
        System.out.println("Value of b is");
        b = obj.nextInt();
        SwapNumbersUsing num = new SwapNumbersUsing();
        num.Swap(a, b);
    }
}
