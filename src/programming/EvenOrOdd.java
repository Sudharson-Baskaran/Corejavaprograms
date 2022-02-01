package programming;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.println("Enter number to check it is Even or Odd");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num%2==0)
		{
			System.out.println(num+"  "+"is an even number ");
		}
		else
		{
			System.out.println(num+"  "+"is an odd number");
		}
	}
}


