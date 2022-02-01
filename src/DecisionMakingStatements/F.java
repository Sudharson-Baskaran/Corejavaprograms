package DecisionMakingStatements;

import java.util.Scanner;

public class F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers to compare");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b)
		{
			System.out.println(a+ "is smaller");
		}
		else if(b<c)
		{
			System.out.println(b+"is smaller");
		}
		else {
			System.out.println(c+"is smaller");
		}

	}

}
