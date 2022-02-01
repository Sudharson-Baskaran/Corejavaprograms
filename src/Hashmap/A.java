package Hashmap;

import java.util.Collection;



import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> h1=new HashMap<Integer, String>();
		h1.put(7,"Dhoni");
		h1.put(10,"sachin");
		h1.put(18, "virat");
		h1.put(19,"Dravid");
		h1.put(24,"Ganguly");
		System.out.println(h1);
		System.out.println(h1.size());
		System.out.println(h1.containsKey(7));
		System.out.println(h1.containsValue("Dravid"));
		Set<Integer> k = h1.keySet();
		Set<Entry<Integer, String>> ent = h1.entrySet();
		for (Map.Entry<Integer, String>i : ent) {
			System.out.println(i.getKey()+" Has value  "+i.getValue());
		}
	}
}


