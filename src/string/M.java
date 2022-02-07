package string;

public class M {

	public static void main(String[] args) {
		
String s="testing";
char[] ch = s.toCharArray();
int count=0;
for (char c : ch) {
	count++;
	
}
//printing in reverse order
for (int i =count-1; i>=0; i--) {
	System.out.print(ch[i]);
}
	}

}
