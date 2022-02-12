package TyssPrograms;

import java.util.HashSet;

public class PrintOnlyUniqueCharacter {
	public static void main(String[] args) {
		String s="hello";
		HashSet<Character>set=new HashSet<Character>();
		for (int i = 0; i <s.length(); i++) {
			set.add(s.charAt(i));
		}
    //Step2:compare each char of set with all char of string
		for (Character ch : set) {
			int count=0;
			for (int i = 0; i <s.length(); i++) {
				if(ch==s.charAt(i))
				{
					count++;
				}

			}
			//Print only unique characters
			if(count==1) {
			System.out.println(ch+" no of occurence is "+count);
			}
		}
	}


}
