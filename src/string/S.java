package string;

public class S {

	public static void main(String[] args) {
		String s="ca@clk12Aaso%12";
		
		
		String alphabets="";
		String numbers="";
		String specialch="";
		for (int i = 0; i <s.length(); i++) {
			if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{
				alphabets=alphabets+" "+s.charAt(i);
			}
			else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				numbers=numbers+" "+s.charAt(i);
			}
			else
			{
				specialch=specialch+" "+s.charAt(i);
			}
		}
System.out.println("Alphabets in the give string : "+alphabets );
System.out.println("Numbers in the given string : "+numbers );
System.out.println("Special characters in the given string : "+specialch );
	}

}
