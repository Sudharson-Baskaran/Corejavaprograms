package TyssPrograms;

public class SumOfElementsFromTwoArray {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		int[]b= {5,6,7,8};
		int count=a.length;
		if(a.length<b.length)
		{
			count=b.length;
		}
		for (int i = 0; i <count; i++) {
			try {
				System.out.print(a[i]+b[i]);
				System.out.print(" ");
			}

			catch(Exception e)
			{
				if(a.length<b.length)	
				{
					System.out.print(b[i]);
					System.out.print(" ");
				}
				else
				{
					System.out.print(a[i]);
					System.out.print(" ");
				}
			}

		}
	}

}
