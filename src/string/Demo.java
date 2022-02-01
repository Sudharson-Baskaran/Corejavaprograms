package string;

public class Demo {

public static void main(String[] args) {
	System.out.println("-------method 1------");
String s1="hello how are you";
String []s2=s1.split(" ");
for (String temp : s2) {
	System.out.println(temp);
}
for (int i=s2.length-1;i>=0;i--) {
	 char[]ch =s2[i].toCharArray();
	for (int j =ch.length-1; j>=0; j--) {
		System.out.print(ch[j]);
	}
	System.out.print(" ");
}
}
}
