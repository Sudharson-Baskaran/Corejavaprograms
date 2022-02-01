package programming;

public class SumOfTerms {


	public static void main(String[] args) {
		int num=1;
		int sum=0;
		// TODO Auto-generated method stub
		for (int i = 1; i <=20; i++) {
			System.out.print(num+",");
			sum=sum+num;
			num=num+3;
		}
		System.out.println();
		System.out.println("Sum of the numbers in the series is:"+sum);
	}

}
