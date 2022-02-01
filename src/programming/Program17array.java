package programming;

public class Program17array 
 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {78,10,2,4,6,8,20};
		
		int largest=a[0];

		for (int i = 1; i < a.length; i++) {
			if(a[i]>largest) {
				largest=a[i];

			}

		}
		System.out.println("The largest number in the array is:  "+largest);
	}

}
