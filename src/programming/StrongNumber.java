package programming;

public class StrongNumber {
	public static int factorial(int ld)
	{
		int fact=1;
		for(int i=ld;i>0;i--)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=145;
		int num1=num;
		int ld=0;
		int sum=0;
		int fact=0;
		while(num>0)
		{
			ld=num%10;
			fact = factorial(ld);
			sum=sum+fact;
			num=num/10;
		}

		if(sum==num1) {

			System.out.println("It is a strong number");
		}
		else {
			System.out.println("It is not a strong number");
		}
	}

}


