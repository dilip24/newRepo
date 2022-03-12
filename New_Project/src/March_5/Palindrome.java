package March_5;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = Obj.nextInt();
		int rsnum = 0;
		int rem;
		if (num < 10)
		{
			System.out.println(num + " is not a palindrome ");
		}
		else
		{
			int actualnum = num;
			while(num!=0)
			{
				rem = num % 10;
				rsnum = rsnum * 10 + rem;
				num = num / 10;
			}
			if (rsnum==actualnum)
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
