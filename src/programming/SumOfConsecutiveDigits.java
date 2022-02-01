package programming;

public class SumOfConsecutiveDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=23145;
		int ld1=0;
		int ld2=0;
		int sum=0;
		while(num>0)
		{
		ld1=num%10;
		num=num/10;
		ld2=num%10;
		sum=sum+(ld1*ld2);	
			
		}
System.out.println(sum);
	}

}
