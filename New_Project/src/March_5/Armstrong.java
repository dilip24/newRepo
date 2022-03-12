package March_5;

import java.util.Scanner;

public class Armstrong 
{
	public static void main(String[] args) 
	{
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = Obj.nextInt();
		int sum = 0;
		int rem;
		int actualnum = num;
			while(num!=0)
			{
				rem = num % 10;
				sum = sum + (rem*rem*rem);
				num = num / 10;
			}
			if (sum==actualnum)
			{
				System.out.println(actualnum + " is an armstrong number ");
			}
			else
			{ 
				System.out.println(actualnum + " is not an armstrong number ");
			}
	}
}