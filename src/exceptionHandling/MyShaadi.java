package exceptionHandling;

import java.util.Scanner;

public class MyShaadi {
	public static void ageVerifier(int age)
	{
		if (age>25) {
			System.out.println("you are elligible");
			
		}
		else
		{
			throw new ShaadiException("You are not elligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter your age");
Scanner s=new Scanner(System.in);
int age=s.nextInt();
ageVerifier(age);
	}

}
