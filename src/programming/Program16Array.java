package programming;

public class Program16Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]a= {2,6,3,4,8};
		int n = a.length;
		for (int i = 0; i<n/2; i++) {
			a[i]=a[i]+a[n-i-1];
			a[n-i-1]=a[i]-a[n-i-1];
			a[i]=a[i]-a[n-i-1];	
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}        

	}
}