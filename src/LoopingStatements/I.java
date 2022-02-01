package LoopingStatements;

import java.util.Scanner;

public class I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a digit");
		int num=sc.nextInt();
		int ld=0;
		while(num>0)
		{
			ld=num%10;
			System.out.println(ld);
			num=num/10;
		}

	}

}
