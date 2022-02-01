package DecisionMakingStatements;

import java.util.Scanner;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check");
		int a=sc.nextInt();
		if(a%2==0&&a%5==0)
		{
			System.out.println("Hi");
		}
		else if (a%2==0) {
			System.out.println("hello");
			
		}
		else if (a%2!=0&&a%3==0&&a%5==0) {
			System.out.println("bye");
			
		}
		else {
			System.out.println("Good bye");
		}

	}

}
