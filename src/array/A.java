package array;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=s.nextInt();
		int[]a= new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		boolean f=false;
		System.out.println("Enter the number to search");
		int toFind=s.nextInt();
		for (int i = 0; i < a.length; i++) {
			if(a[i]==toFind)
			{
				f=true;
				System.out.println("Number is present in array");
				break;
			}
		}
		if(f==false)
		{
			System.out.println("Number is not present in array");
		}

	}

}
