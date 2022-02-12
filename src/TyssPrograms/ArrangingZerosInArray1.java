package TyssPrograms;

public class ArrangingZerosInArray1 {

	public static void main(String[] args) {
		int[]a= {1,2,0,0,6,0};
		for (int i = 0; i < a.length; i++) {
			if(a[i]==0)
			{
				System.out.print(a[i]+" ");
			}
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0) {
				System.out.print(a[i]+" ");
			}
		}
	}

}
