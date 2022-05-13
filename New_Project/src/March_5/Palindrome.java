package March_5;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = Obj.nextInt();
		int sum = 0;
		int rem;
		if (num <= 100)
		{
			System.out.println(num + " is not a palindrome ");
		}
		else
		{
			int actualnum = num;
			while(num!=0)
			{
				rem = num % 10;
				sum = sum * 10 + rem;
				num = num / 10;
			}
			if (sum==actualnum)
			{
				System.out.println(actualnum + " is a palindrome ");
			}
			else
			{ 
				System.out.println(actualnum + " is not a palindrome ");
			}
		}
	}
		
}
