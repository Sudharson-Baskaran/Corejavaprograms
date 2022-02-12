package TyssPrograms;

public class OccurenceOfEachCharacter {

	public static void main(String[] args) {
		String sentence="Sudharson ";
		String s= sentence.replace(" ","").toLowerCase();
		char[] ch = s.toCharArray();
		int count=0;

		for (int i = 0; i <26; i++) {
			char letter = (char) ('a'+i);
			for (int j = 0; j < ch.length; j++) {
				if(ch[j]==letter)
				{
					count++;
				}

			}
			if(count>=1) {
				System.out.println(letter+" has "+count+" occurence");
				count=0;
			}

		}
	}
}





