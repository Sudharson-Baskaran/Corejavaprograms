package programming;

import java.util.Scanner;

public class Program34 {

	public static void main(String[] args) {
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int row=s.nextInt();
		System.out.println("Enter no of columns");
		int col=s.nextInt();
		int[][]a=new int[row][col];
		System.out.println("Enter values of matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=s.nextInt();
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum=a[i][j]+sum;

			}
			System.out.println(sum);
			sum=0;
		}

	}

}
