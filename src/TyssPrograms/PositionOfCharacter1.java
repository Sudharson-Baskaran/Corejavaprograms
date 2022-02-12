package TyssPrograms;

import java.util.LinkedHashSet;

public class PositionOfCharacter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="tester";
		s=s.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i <s.length(); i++) {
			set.add(s.charAt(i));
		}
		
		for (Character ch : set) {
			for (int i =0; i<s.length(); i++) {
				if(ch==s.charAt(i)) {
					System.out.println(ch+" position is "+(i+1));
				    break;

			}
		}
	}

	}

}
