package string;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("happy");
		String s2=" ";
		for (int i = 0; i < s1.length(); i++) {
			s2=s1.charAt(i)+s2;
		}
System.out.println(s2);
System.out.println(s2.length());
s2=s2.trim();
System.out.println(s2.length());
	}

}
