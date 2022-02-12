package TyssPrograms;

public class C {
	public static String reverse(String str) {
		String rev="";
		for (int i = 0; i <str.length(); i++) {
			rev=str.charAt(i)+rev;
		}
		return rev;
	}
	

	public static void main(String[] args) {
		String s="welcome to india welcome to mandya";
		String[] str = s.split(" ");
		for (int i =str.length-1; i>=0; i--) {
			System.out.print(reverse(str[i])+" ");
			
		}

	}

}
