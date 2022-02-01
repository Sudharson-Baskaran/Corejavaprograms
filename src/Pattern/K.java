package Pattern;

public class K {

	public static void main(String[] args) {
		int num=1;int n=5;
		for (int i = 0; i <n; i++) {
			
			for (int j = 0; j <(i*2)+1; j++) {
				if(j%2==0)
				{
					System.out.print(num);
					
				}
				else 
				{
					System.out.print("*");
					
				}
	
			}
			System.out.println();
			num=num+2;
		}

	}

}
