package programming;

import java.util.Scanner;

public class EvenOrOddMessages {

	public static void main(String[] args) {

		System.out.println("Enter two numbers to set the range");
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		while(num1<=num2) {
			if(num1%2==0)
			{
				System.out.println(num1+"  "+"is an even number");
			}
			else
			{
				System.out.println(num1+"  "+"is an odd number");
			}
			num1++;
		}


	}
}


