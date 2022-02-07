package string;

public class N {

	public static void main(String[] args) {
		String s="hello how are you";
		String reverse=" ";
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			reverse=reverse+reverse(s1[i])+" ";
		}
		reverse=reverse.trim();
		System.out.println(reverse);
	}
public static String reverse(String S)
{
	String s1=S;
	String reverse=" ";
for (int i = 0; i <S.length(); i++) {
	reverse=S.charAt(i)+reverse;
}
return reverse;
}
}
