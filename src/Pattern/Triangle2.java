package Pattern;

public class Triangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int sp=n-1;
		int c=1;
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <sp; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <c; j++) {
				System.out.print("*");
			}
			sp--;
			c=c+2;
			System.out.println();
		}

	}

}
