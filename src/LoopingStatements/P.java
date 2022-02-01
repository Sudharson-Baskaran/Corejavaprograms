package LoopingStatements;

public class P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=1;
		int num2=10;
		int sumsquare=0;
		for (int i = num1; i <num2; i++) {
			if(i%2==0) {
				sumsquare=sumsquare+(i*i);			
			}

		}
		System.out.println("Sum of square of even numbers present in the given range is :"+sumsquare);
	}
}
