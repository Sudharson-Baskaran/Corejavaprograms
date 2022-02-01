package array;

public class H {
	public static int largestNumber(int[]a)
	{
		int largest=a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i]>largest) {
				largest=a[i];
			}
		}
		return largest;
	}
	public static void main(String[]args)
	{
		int[]a= {20,40,10,60,25};
		int j=largestNumber(a);
		System.out.println(j);
	}
}
