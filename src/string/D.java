package string;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		String s="no";
		char[]ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(s.charAt(i)=='a')
			{
				c++;
				System.out.println("a is present");
				break;
			}
		}
		if(c==0)
		{
			System.out.println("a is not present");
		}

	}

}
