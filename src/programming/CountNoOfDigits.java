package programming;

import java.util.Scanner;

public class CountNoOfDigits {

	public static void main(String[] args) {
		System.out.println("Enter a number to find how many digits present in it");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int num1=num;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Total number of digit in  "+  num1  +" is: "+count);
	}

}
