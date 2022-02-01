package Pattern;

public class Triangle {

	public static void main(String[] args) {
	int n=3;
	int c=5;
	int sp=c-3;
	for (int i = 0; i <n; i++) {
		
		for (int j = 0; j <sp; j++) {
			System.out.print(" ");
		}
		for (int j = 0; j <(i*2)+1; j++) {
			System.out.print("*");
		}	
		
		System.out.println();
		sp=sp-1;
		

	}
	}
}
	