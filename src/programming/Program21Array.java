package programming;

public class Program21Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,3,5,6,8,20};
		for (int i = 0; i < a.length-1; i++) {
			for (int j = a[i]+1; j <a[i+1]; j++) {
				System.out.println(j);
			}
		}

	}

}
