package TyssPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number to check the given number is prime number or not");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int i=2;
		while(i<num)
		{
		if(num%i==0)
	    break;
        i++;
		}

		if(i==num)
		{
			System.out.println("It is prime number");
		}
		else {
			System.out.println("It is not a prime number");
		}
	}

}
