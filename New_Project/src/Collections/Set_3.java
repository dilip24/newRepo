package Collections;

import java.util.TreeSet;

public class Set_3 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> hs = new TreeSet<Integer>();
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
