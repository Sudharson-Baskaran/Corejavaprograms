package TyssPrograms;

public class SumOfDigitInString {

	public static void main(String[] args) {
		String s="T12@2113";
		int sum=0;

		for (int i = 0; i <s.length(); i++) {
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				sum+=s.charAt(i)-48;
			}

		}
		System.out.println(sum);
	}

}
