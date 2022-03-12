package March_5;

import java.util.Scanner;

public class Prime 
{
	public static void main(String[] args) 
	{
		boolean flag = true;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = obj.nextInt();
		if((a==0)||(a==1))
		{
			System.out.println("Its not a prime number");
			flag = false;
		}	
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				System.out.println("Its not a prime number");
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Its a prime number");
		}
	}

}
