package programming;

public class SumAndProduct {


	public static void main(String[] args) {
        
		int num=2315;
		int sum=0;
		int ld1=0;
		int ld2=0;

		while(num>0)
		{
			ld1=num%10;
			num=num/10;
			ld2=num%10;
			sum=sum+(ld1*ld2);
		}
		System.out.println("Sum of product of digits in a given numbers is:"+sum);
	}

}
