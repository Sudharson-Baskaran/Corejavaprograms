package TyssPrograms;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println("Enter the number");
       Scanner s=new Scanner(System.in);
       int num=s.nextInt();
       int sum=0;
       while(num>0)
       {
    	  int ld=num%10; 
    	  sum+=ld;
    	  num=num/10;
    	   
       }
       System.out.println("Sum of numbers present in the given digit is : "+sum);
	}

}
