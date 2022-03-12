package March_5;

import java.util.Scanner;

public class Factorial 
{
	public void Fact (int a)
	{
		int i = 1;
        long factorial = 1;
        while(i <= a)
        {
            factorial = factorial*i;
            i++;
        }
        System.out.println("Factorial of the given number is "+factorial);
	}
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Find the factorial of");
		int num = obj.nextInt();
        Factorial Facto = new Factorial();
        Facto.Fact(num);
        //System.out.printf("Factorial of %d = %d", num, factorial);
    }

}
