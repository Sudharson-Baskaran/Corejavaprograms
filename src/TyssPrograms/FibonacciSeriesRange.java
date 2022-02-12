package TyssPrograms;

public class FibonacciSeriesRange {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int range=100;
		//System.out.print(a+","+b+",");
		for (int i = 0; i <range; i++) {
			int c=a+b;
			if(c<range)
			{
				System.out.print(c+",");
				a=b;
				b=c;
			}
		}

	}

}
