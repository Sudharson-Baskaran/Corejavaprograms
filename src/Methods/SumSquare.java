package Methods;

public class SumSquare {
	public static void sum(int a,int b)
	{ int sum=0;
	for(int i=a;i<=b;i++) {
		if(i%2==1)	
		{
			sum=sum+(i*i);
		}		
	}
	System.out.println("sum of square of odd numbers present in the given range is:"+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(1,10);
	}

}
