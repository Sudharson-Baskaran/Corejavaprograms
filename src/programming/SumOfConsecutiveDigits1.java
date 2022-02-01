package programming;

public class SumOfConsecutiveDigits1 {

	public static void main(String[] args) {
		int num1=427;
		int num2=527;
		int ld1;
		int ld2;
		
		int sum = 0;
		while(num1>0&&num2>0)
		{
			ld1=num1%10;
			ld2=num2%10;
			sum=sum+(ld1*ld2);
			num1=num1/10;
			num2=num2/10;
			}
			
System.out.println("Sum and product of consecutive digits present in the number is :"+sum);
	}

}
