package Collections;

import java.util.ArrayList;

public class List_1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> hs = new ArrayList<Integer>();
		hs.add(123);
		hs.add(345);
		hs.add(678);
		hs.add(789);
		hs.add(456);
		hs.add(567);
		hs.add(678);
		hs.add(234);
		hs.add(null);
		
		for(Integer i:hs)
		{
			System.out.println(i);
		}
		
	}

}
