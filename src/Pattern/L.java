package Pattern;

public class L {

	public static void main(String[] args) {
		int n=5;
		for (int i = 0; i <n; i++) {
			char ch=(char)(i+'A');
			for (int j = 0; j <(i*2)+1; j++) {
				if(j%2==0)
				{
					System.out.print(ch);
					ch--;
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
