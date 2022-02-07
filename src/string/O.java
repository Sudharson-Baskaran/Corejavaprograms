package string;

public class O {

	public static void main(String[] args) {
		String s="Hello how are you";
		String[] s1=s.split(" ");
		String rev="";
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s1[i].length(); j++) {
				rev=s1[i].charAt(j)+rev;
			}
			rev=" "+rev;
		}
		rev=rev.trim();
		System.out.println(rev);
	}

}
