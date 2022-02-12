package TyssPrograms;

public class ArrangingZerosInArray {

	public static void main(String[] args) {
		int[]a= {3,0,1,0,0,2,0};
		int[]b=new int[a.length];
		int starting=0;
		int ending=b.length-1;
		for (int i = 0; i < b.length; i++) {
			if(a[i]==0)
			{
				b[ending]=a[i];
				ending--;
			}
			else {
				b[starting]=a[i];
				starting++;
			}
		}
	for (int i = 0; i < b.length; i++) {
		System.out.print(b[i]+" ");
	}
	}
}
