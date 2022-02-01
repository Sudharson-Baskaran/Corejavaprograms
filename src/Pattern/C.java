package Pattern;
//1
//2*3
//4*5*6
//7*8*9*1
//2*3*4*5*6

public class C {

	public static void main(String[] args) {
		
		int n=5;
		int num=1;
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <(i*2)+1; j++) {
				if(j%2==0)
				{
					System.out.print(num);
					num++;
				}
				else {
					System.out.print("*");
				}

				if(num==10)
				{
					num=1;
				}

			}
			System.out.println();
		}

	}

}






