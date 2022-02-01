package programming;

import java.util.Scanner;

public class SumOfEvenDigits {

	public static void main(String[] args) {
		

int num=23617;
int ld = 0;
int sum=0;
while(num>0)
{
ld=num%10;
if(ld%2==0)
{
sum=sum+ld;
}
num=num/10;
}
System.out.println("Sum of even numbers present in the given number is :"+sum);
	}

}
