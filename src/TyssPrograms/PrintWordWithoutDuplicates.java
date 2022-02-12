package TyssPrograms;

import java.util.LinkedHashSet;

public class PrintWordWithoutDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to india welcome to mandya";
		String[] s1 = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < s1.length; i++) {
			set.add(s1[i]);
		}
		for (String string : set) {
			System.out.print(string+" ");
		}

	}
}



