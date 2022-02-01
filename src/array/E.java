package array;

public class E {
	public static int sum(int[]a)
	{
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];

		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {12,13,14,15,16
				
		};
		int c=sum(a);	
System.out.println("sum of numbers present in the array:"+c);
	}

}
