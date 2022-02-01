package basics;

public class A {
	public static void main(String[] args) {
		
	String s="ABCDCBA";
	String s1="";
	for (int i = s.length()-1; i>=0; i--) {
		s1=s1+
				s.charAt(i);
	}
	s1=s1.trim();
	if(s1.equals(s))
	{
		System.out.println("It is a palindrome");
	}
	else
	{
		System.out.println("It is not a palindrome");
	}
	}
}
