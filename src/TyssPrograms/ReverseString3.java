package TyssPrograms;

public class ReverseString3 {
	//Reverse the string without using length() and length?

	public static void main(String[] args) {
		String s="tyss";
		char[] ch = s.toCharArray();
		int count=0;
		for (char c : ch) {
			count++;
		}
		for (int i =count-1; i>=0; i--) {
			System.out.print(ch[i]);
		} 
	}

}
