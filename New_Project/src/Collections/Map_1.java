package Collections;

import java.util.HashMap;
import java.util.Set;

public class Map_1 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(11, "Chennai");
		hm.put(33, "Mumbai");
		hm.put(55, "Delhi");
		hm.put(77, "Lucknow");
		hm.put(22, "Bangalore");
		hm.put(44, "Hyderabad");
		hm.put(66, "Kolkata");
		hm.put(88, "Ahmedabad");
		hm.put(88, "Jaipur"); // Duplicate Key will override the Value
		hm.put(99, "Jaipur"); // Duplicate Value is allowed
		hm.put(null, "Shimla"); // null Key is allowed
		hm.put(null, null); // null Value is allowed
		
		Set<Integer> allKeys = hm.keySet();
		
		for(Integer i:allKeys)
		{
			System.out.println("Key is "+i);
			System.out.println("Value is "+hm.get(i));
		}
		
	}

}
