package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Q {

	public static void main(String[] args) {
		String s="aaaaabcdefff";
		TreeSet t=new TreeSet();
		for (int i = 0; i <s.length(); i++) {
			char ele = s.charAt(i);
			t.add(ele);
		}
		for (Object object : t) {
			System.out.print(object);
		}
		
		}
	}


