package TyssPrograms;

public class PrintPrimeNumberInTheGivenArray {

	public static void main(String[] args) {
		int[]a= {2,3,4,5,6,7,8};
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = 2; j <=a[i]; j++) {
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(a[i]+" ");
			}
		}
		

	}

}
