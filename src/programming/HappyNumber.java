
package programming;

import java.util.Scanner;

public class HappyNumber {
	public static int checkHappyNumber (int number)
	{
	int rem = 0, sum = 0;
	
	while(number > 0)
	{
	rem = number %10;
	sum = sum+(rem*rem);
	number = number/10;
	}
	return sum;
	}
	public static void main(String[] args)
	{

	int number=19;
	int result = number;
	while (result>9)
	{
	result = checkHappyNumber(result);
	}
	if (result ==1)
	{
	System.out.println ("It is a Happy Number");
	}
	else
	{
	System.out.println (" It is not a Happy Number");
	}
	}
}