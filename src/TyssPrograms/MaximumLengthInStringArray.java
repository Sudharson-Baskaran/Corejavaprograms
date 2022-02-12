package TyssPrograms;

public class MaximumLengthInStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]s= {"welcome","hi","welcome","hello","hello","ffggugiugu"};
		String maximum = s[0];
		for (int i = 1; i < s.length; i++) {
			if(maximum.length()<s[i].length())
			{
				maximum=s[i];
			}
		}
		for (int i = 0; i < s.length; i++) {
			if(maximum.length()==s[i].length())
			{
				System.out.println(s[i]);
			}
		}

	}

}
