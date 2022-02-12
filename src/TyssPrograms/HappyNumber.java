package TyssPrograms;

import java.util.Scanner;

public class HappyNumber {
	public static int checkHappyNumber(int num)
	{
		int sum=0,ld=0;
		while(num>0)
		{
			ld=num%10;
			sum=sum+(ld*ld);
			num=num/10;
			
		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		System.out.println("Enter a number to check happy number or not");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int temp=num;
		
		while(temp>9)
		{
			temp=checkHappyNumber(temp);
		}
	if(temp==1)
	{
		System.out.println(num+" It is a happy number");
	}
	else
	{
		System.out.println(num+" It is not a happy number");
	}

	}

}
