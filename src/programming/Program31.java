package programming;

public class Program31 {
	//wap to check givem string is lapindrome?

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abab";
	    
	    int[]a1=new int[26];
	    int[]a2=new int[26];
	    boolean result=false;
	   for (int i = 0; i <s.length()/2; i++) {
		if(s.charAt(i)>='a'&&s.charAt(i)<='b')
		{
			a1[s.charAt(i)-'a']++;
			
		}
		}
	   for (int i =0; i<s.length(); i++) {
		if(s.charAt(i)>='a'&&s.charAt(i)<='z')
		{
			a2[s.charAt(i)-'a']++;
		}
	}
	 for (int i=s.length()-1; i> a2.length; i++) {
		if(a1[i]==a2[i])
		{
			result=true;
		}
	}
	if(result==true)
	{
		System.out.println("Lapindrome");
	}
	else
	{
		System.out.println("Not a palindrome");
	}
	}
		

		}
		
	


