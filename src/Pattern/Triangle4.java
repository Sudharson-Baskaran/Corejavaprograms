package Pattern;

public class Triangle4 {

	public static void main(String[] args) {
		int n=5;
		int sp=n-1;
		int c=1;
		for (int i = 0; i <n; i++) {
			if(c==7) {
				sp++;
				c=c-2;

			}


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