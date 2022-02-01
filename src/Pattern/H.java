package Pattern;

public class H {

	public static void main(String[] args) {
		int n=6; int num=1;
		for (int i = 0; i <n; i++) {
		for (int j = 0; j <(i*2)+1; j++) {
			if(j%2==1)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(num);
				num++;
			}
			if(num==18)
			{
				break;
			}
		}
		System.out.println();
		}

	}

}
