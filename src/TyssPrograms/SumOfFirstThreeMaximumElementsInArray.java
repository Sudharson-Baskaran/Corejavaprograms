package TyssPrograms;

public class SumOfFirstThreeMaximumElementsInArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {10,20,50,60,100,5};
		int sum=0;

		for (int i = 0; i < a.length; i++) {
			for (int j =i+1; j < a.length; j++) {
				if(a[i]<a[j])
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
		System.out.println("sum of first three maximum elements :"+sum);
		
	}

}