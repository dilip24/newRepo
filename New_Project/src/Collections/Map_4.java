package Collections;

import java.util.LinkedHashMap;

public class Map_4
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Integer, String> hm1 = new LinkedHashMap<Integer, String>();
		hm1.put(11, "Chennai");
		hm1.put(33, "Bangalore");
		hm1.put(55, "Hyderabad");
		hm1.put(77, "Mumbai");
		hm1.put(null, "Shimla");
		
		LinkedHashMap<Integer, String> hm2 = new LinkedHashMap<Integer, String>();
		hm2.put(22, "Delhi");
		hm2.put(44, "Kolkata");
		hm2.put(66, "Ahmedabad");
		hm2.put(88, "Lucknow");
		hm2.put(111, null);
		
		LinkedHashMap<String, LinkedHashMap<Integer, String>> master = new LinkedHashMap<String, LinkedHashMap<Integer, String>>();
		master.put("HM1", hm1);
		master.put("HM2", hm2);
		System.out.println(master.get("HM1"));
		System.out.println(master.get("HM2"));
		
	}

}
