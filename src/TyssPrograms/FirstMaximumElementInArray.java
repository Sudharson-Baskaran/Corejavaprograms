package TyssPrograms;

public class FirstMaximumElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {10,20,50,60,100,5};
		
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
		System.out.println("First maximum element in the array is : "+a[0]);

}
}