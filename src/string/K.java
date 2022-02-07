package string;

import java.util.HashSet;

public class K {

	public static void main(String[] args) {
	 String s="bye";
	 String reverse="";
	 for (int i = s.length()-1; i>=0; i--) {
		reverse=reverse+s.charAt(i);
	}
	reverse=reverse.trim();
	if(s.equals(reverse))
	{
		System.out.println("given string is palindrome");
	}
	else
	{
		System.out.println("given string is not a palindrome");
	}
	}

}
