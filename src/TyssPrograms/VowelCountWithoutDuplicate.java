package TyssPrograms;

import java.util.LinkedHashSet;

public class VowelCountWithoutDuplicate {

	public static void main(String[] args) {
		String s="testyantra";
		int vowelCount=0;
		
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for (int i = 0; i <s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
			{
				vowelCount++;
			}
		}
		System.out.print("Vowels count without duplicate : "+vowelCount);
	}
}
