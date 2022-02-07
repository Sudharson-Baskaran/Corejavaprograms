package TyssPrograms;

import sun.security.util.Length;

public class ReverseString2 {
	//reverse the string using third variable?

	//public static void main(String[] args) {

	//String s="tyss";
	//String reverse="";
	//for (int i =s.length()-1; i>=0; i--) {
	//reverse=reverse+s.charAt(i);
	//}
	//System.out.println(reverse);
	//}


	//==================================

	public static void main(String[] args) {

		String s="tyss";
		String reverse="";
		for (int i = 0; i <s.length(); i++) {
			reverse=s.charAt(i)+reverse;
		}
		System.out.println(reverse);
	}

}