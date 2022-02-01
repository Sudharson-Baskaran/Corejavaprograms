package programming;

public class program33 {
public static void main(String[] args) {
			// TODO Auto-generated method stub
			String[] s= {"aba","abc","cde"};
			for (int i = 0; i < s.length; i++) {
				String s1=s[i];
				if(s1.charAt(0)=='a'&&s1.charAt(s.length-1)=='a')
				{
					System.out.println(s1);
				}

	}

}
}