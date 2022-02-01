package programming;

import java.util.Scanner;

public class Program15Array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[]a= {24,7,8,9};
		System.out.println("Before Swapping");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Enter the index values to e swapped;");
		int i1=s.nextInt();
		int i2=s.nextInt();
		
		a[i1]=a[i1]+a[i2];
		a[i2]=a[i1]-a[i2];
		a[i1]=a[i1]-a[i2];
		System.out.println("After swapping");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
	}
     
        	
			
		
	}


