package Pattern;

public class D
{

	public static void main(String[] args) {
		int n=3;
		int c=5;
		int sp=c-1;
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <sp; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <(i*2)+1; j++) {
				System.out.print("*");
			}	
			
			System.out.println();
			sp=sp-2;
			
			
		}


	
		
	}
}
