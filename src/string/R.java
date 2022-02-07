package string;

import java.util.HashSet;
import java.util.TreeSet;

public class R {

	public static void main(String[] args) {
		String s="hi hi hello hello bye ";
		String[] s1 = s.split(" ");
		HashSet h=new HashSet();
		for (int i = 0; i < s1.length; i++) {
			String ele = s1[i];
			h.add(ele);
		}
        TreeSet t=new TreeSet(h);
        for (Object object : t) {
			System.out.println(object);
		}
	}

}
