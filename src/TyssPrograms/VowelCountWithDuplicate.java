package TyssPrograms;

public class VowelCountWithDuplicate {

	public static void main(String[] args) {
		String[] s= {"apple","banana"};

		for (int i = 0; i < s.length; i++) {
			int vowelcount=0;
			for (int j = 0; j < s[i].length(); j++) {
				if(s[i].charAt(j)=='a'||s[i].charAt(j)=='e'||s[i].charAt(j)=='i'||s[i].charAt(j)=='o'||s[i].charAt(j)=='u') {
					vowelcount++;

				}

			}
			System.out.println(s[i]+"====>"+vowelcount);
		}


	}

}
