package Pattern;
//1
//2*3
//4*5*6
//7*8*9*10
//11*12*13*14*15

public class E {

	public static void main(String[] args) {
		int n=5;
		int num=1;
		int c=9;
		int sp=c-8;
		for (int i = 0; i <n; i++) {
			if(i%2==0)
			{
				
			}
		for (int j = 1; j <=(i*2)+1; j++) {
			if(j%2==0)
			{
				
				System.out.print("*");
			}
			else if(j%2==1) {
				
			System.out.print(num);
			num++;
		}
		}

		System.out.println();
		
		}


	}
}




