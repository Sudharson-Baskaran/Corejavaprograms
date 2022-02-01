package string;

public class J {
static int count=0;
public static void check(String s1)
{
	for (int i = 0; i <s1.length(); i++) {
		if(s1.charAt(i)=='a')
		{
			count++;
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello how";
		String[] s2 = s1.split(" ");
		for (int i = 0; i < s2.length; i++) {
			check(s2[i]);
			
		}
		if(count==0)
		{
			System.out.println("character a is not present");
		}
		else {
			System.out.println("charcter a is present");
		}

	}

}
