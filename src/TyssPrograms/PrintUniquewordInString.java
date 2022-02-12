package TyssPrograms;

import java.util.LinkedHashSet;

public class PrintUniquewordInString {

	public static void main(String[] args) {
		String s="welcome to india welcome to mandya";
		String[] s1=s.split(" ");
		LinkedHashSet<String>set=new LinkedHashSet<String>();
		for (int i = 0; i < s1.length; i++) {
			set.add(s1[i]);
		}
		for (String s2 : set) {
			int count=0;
			for (int i = 0; i < s1.length; i++) {
				if(s2.equalsIgnoreCase(s1[i]))
				{
					count++;
				}
			}
			if(count==1) {
				System.out.println(s2+" : no of occurence "+count);
			}
		}

	}
}