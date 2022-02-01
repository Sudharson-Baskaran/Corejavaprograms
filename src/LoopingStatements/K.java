package LoopingStatements;

import java.util.Scanner;

public class K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 4 digit number");
        int num=sc.nextInt();
        int sum=0;
        int ld;
        while(num>0)
        {
        	ld=num%10;
        	sum+=ld;
        	num=num/10;
        }
System.out.println(sum);
	}

}
