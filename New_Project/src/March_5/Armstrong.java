package March_5;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter 3 digit number: ");
		int num = myObj.nextInt();
		int originalnum,temp,result=0;
		originalnum = num;
		for(;originalnum!=0;originalnum=originalnum/10)
		{
			temp = originalnum%10;
			result = result + temp*temp*temp;
		}
	
		if (num==result)
		{
			System.out.println(num + " is armstrong number ");
		}
		else
		{ 
			System.out.println(num + " is not armstrong number ");
		}
	}
}