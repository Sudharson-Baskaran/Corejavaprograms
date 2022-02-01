package Methods;



public class PrintEven {
	public static void print(int a,int b) {
		for (int i = a; i <=
				b; i++) {
			if(i%2==0) {
				System.out.println(i);
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print(1,10);

	}

}
