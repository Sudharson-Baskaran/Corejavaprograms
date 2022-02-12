package TyssPrograms;

public class SumOfFirstThreeMinimumElements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[]a= {10,20,50,60,100,5};

		for (int i = 0; i < a.length; i++) {
			for (int j =i+1; j < a.length; j++) {
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}

			}
		}
		
for (int i = 0; i <3; i++) {
	sum=sum+a[i];
	
}
System.out.println("Sum of first three minimum elements in the array :"+sum);
	}

}
