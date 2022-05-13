package Collections;

import java.util.LinkedHashSet;

public class Set_2 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		hs.add(123);
		hs.add(345);
		hs.add(678);
		hs.add(789);
		hs.add(456);
		hs.add(567);
		hs.add(678);
		hs.add(234);
		hs.add(789);
		
		for(Integer i:hs)
		{
			System.out.println(i);
		}
		
	}

}
