package Collections;

import java.util.HashSet;

public class Set_1 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(123);
		hs.add(345);
		hs.add(678);
		hs.add(567);
		hs.add(456);
		hs.add(789);
		hs.add(678);
		hs.add(234);
		hs.add(789);
		
		for(Integer i:hs)
		{
			System.out.println(i);
		}
		
	}

}
