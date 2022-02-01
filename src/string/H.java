package string;

public class H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello how are you";
		String[] s1 = s.split(" ");
		String s3=" ";
		for (int i = 0; i < s1.length; i++) {
			s3=s1[i]+" "+s3;
			
		}

		
s3=s3.trim();
System.out.println(s3);
	}

}
