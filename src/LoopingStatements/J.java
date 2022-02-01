package LoopingStatements;

public class J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=50;
int sumOdd=0;
int sumEven=0;
while(num<=100)
{
if(num%2==0) {
	sumEven+=num;
}
else if(num%2==1) {
	sumOdd+=num;
}
num++;
}
System.out.println("sum of odd numbers in the range is:"+sumOdd);
System.out.println("Sum of even numbers in the given range is:"+sumEven);
	}

}
