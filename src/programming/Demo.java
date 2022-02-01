package programming;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num =0;
		int count=0;
		//Empty String
		String  primeNumbers = "";
		System.out.println("Enter the value of n:");
		int n = scanner.nextInt();
		scanner.close();
		for (int i = 1; i <= n; i++)  	   
		{ 		 		  

			for(int j=i; j>=1; j--)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if (count ==2)
			{
				//Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";

			}	
			count=0;
		}	
		System.out.println("Prime numbers from 1 to n are :");
		System.out.println(primeNumbers);

	}

}




