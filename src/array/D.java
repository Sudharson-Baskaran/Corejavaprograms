package array;

import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int a=s.nextInt();
		int[]b=new int[a];
		System.out.println("Enter number to add");
		for (int i = 0; i < b.length; i++) {
			b[i]=s.nextInt();

		}
		boolean f=false;
		System.out.println("Enter to number to search in array");
		int toFind=s.nextInt();
		for (int i = 0; i < b.length; i++) {
			if(b[i]==toFind)
			{
				f=true;
				System.out.println("Number is present in array");
				break;
			}
		}
		if(f==false) {
			System.out.println("Number is not present in array");
		}
	}


}


