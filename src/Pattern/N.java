package Pattern;

public class N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for (int i = 0; i <n; i++) {
			int k=(1);
			for (int j = 0; j <(i*2)+1; j++) {
				if(j%2==0)
				{
					System.out.print(k);
					k++;
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
	}

	}
}