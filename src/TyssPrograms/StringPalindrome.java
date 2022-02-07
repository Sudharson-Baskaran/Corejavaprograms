package TyssPrograms;

public class StringPalindrome {
	//check the given string is palindrome or not?
	public static void main(String[] args) {

		String s="madam";
		String reverse="";

		for(int i=s.length()-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);

		}
		if(s.equals(reverse))
		{
			System.out.println(s+" is a palindrome");	

		}
		else {

			System.out.println(s+" is not a palindrome");
		}
	}

}
