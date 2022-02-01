package programming;

import java.util.Scanner;

public class MulpicationTable {

	public static void main(String[] args) {
System.out.println("Enter a number to display the multiplication table");
Scanner s=new Scanner(System.in);
int num=s.nextInt();
for (int i = 1; i <=10; i++) {
	System.out.println(num+"*"+i+"="+(num*i));
	
}
		  
		}

	}


