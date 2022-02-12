package TyssPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveOnlyDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="executed script";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i <s.length(); i++) {
			set.add(s.charAt(i));

		}

		for (Character ch : set) {
			System.out.print(ch);
		}
	}
}


