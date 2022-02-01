package string;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="idioms";
		int count=0;
		char[]ch=s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(s1.charAt(i)=='i')
			{
				count++;
			}
		}
System.out.println(count);			
	}
		
	}





