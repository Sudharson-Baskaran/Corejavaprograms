package TyssPrograms;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		int sum=0;
		int ld=0;
		System.out.println("Enter a number to check palindrome or not");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int temp=num;
		while(num>0)
		{
			ld=num%10;
			sum=(sum*10)+ld;
			num=num/10;
			
		}
		
		
		if(sum==temp)
		{
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not a palindrome");
		}
	}

}