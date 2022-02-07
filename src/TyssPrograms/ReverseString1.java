package TyssPrograms;

public class ReverseString1 {
	//Reverse the string without using third variable?

	public static void main(String[] args) {
		String s="tyss";
		for (int i = s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}

	}

}
