package LoopingStatements;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter positive number to get table of that number");
int a=sc.nextInt();
for(int i=1;i<=10;i++) {
	System.out.println(i+"X"+a +"="+(i*a));
}
}
	

}
