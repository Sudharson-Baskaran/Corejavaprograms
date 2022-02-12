package TyssPrograms;

public class A {
	//print first 100 prime number
	public static boolean checkPrime(int num)
	{
		boolean result=false;
		int count=0;

		for (int i =1 ; i <=num; i++) {
			if(num>0) 
			{
				if(num%i==0) 
				{
					count++;
				}
			}
		}
		if(count==2)
		{
			result=true;
			count=0;
		}
		return result;

	}

	public static void main(String[] args) {
		int num=100;
		for (int i =1; i<=num; i++) {
			if(checkPrime(i))
			{
				System.out.print(i+", ");

			}

		}


	}

}
