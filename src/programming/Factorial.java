package programming;

public class Factorial {
	public static int factoriallNumber(int num)
	{

		int fact=1;
		while(num>0)
		{
			fact=fact*num;
			num--;
		}

	 	return fact;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int result=factoriallNumber(num);
		System.out.println("Factorial of "+num+" is: "+result);
	}

}
