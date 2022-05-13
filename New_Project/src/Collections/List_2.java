package Collections;

import java.util.LinkedList;

public class List_2 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> hs = new LinkedList<Integer>();
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
