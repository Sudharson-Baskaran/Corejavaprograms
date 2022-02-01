package string;

public class F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("aaacbbbbcdddd");
		String[] s2 = s1.split("c");
		for (int i = 0; i < s2.length; i++) {
			System.out.println(s2[i]);
			
		}

	}

}
