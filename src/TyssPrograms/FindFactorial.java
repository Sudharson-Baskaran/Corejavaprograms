package TyssPrograms;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		int fact=1;
		System.out.println("Enter a number to print the factorial");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
for (int i = 1; i <=num; i++) {
	fact=fact*i;
	
}
System.out.println("The factorial of given number"+num+" is :"+fact);
	}

}
