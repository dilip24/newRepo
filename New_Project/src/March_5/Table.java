package March_5;

import java.util.Scanner;

public class Table 
{
	public static void main(String args[])  
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a value for printing the table");
		int a = obj.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(a+" * "+i+" = "+a*i);
		}
	}

}
