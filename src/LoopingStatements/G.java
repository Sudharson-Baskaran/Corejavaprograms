package LoopingStatements;

public class G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=20;
int num2=50;
int sum=0;
while(num1<=num2)
{
	if(num1%2==0) {
		sum+=num1;
	}
	num1++;
	}
System.out.println("sum of even numbers in the given range is :"+sum);
	}

}
