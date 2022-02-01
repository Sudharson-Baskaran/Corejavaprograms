package DecisionMakingStatements;

import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age to check");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("voter is elligible to vote");
		}
		else {
			System.out.println("voter is not elligible to vote");
		}

	}

}
