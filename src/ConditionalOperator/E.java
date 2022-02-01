package ConditionalOperator;

import java.util.Scanner;

public class E {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check");
		int num=sc.nextInt();
		int ld=num%10;
		System.out.println("Ld is "+ld);
		System.out.println(ld%3==0?"Ld is divisible by 3":"Ld is not divisible by 3");
	}

}
