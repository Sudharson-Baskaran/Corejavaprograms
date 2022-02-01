
package programming;

import java.util.Scanner;

public class Program23Array {

	public static void main(String[] args) {
		int[]a=readArray();
		int[]b=readArray();
		int[]c=combineArray(a,b);
		System.out.println("Combined ARRAY");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}


	}
	public static int[] readArray()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int size=s.nextInt();
		int[]a=new int[size];
		System.out.println("Enter "+size+" values to store in ARRAy");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		return a;
	}
	public static int[] combineArray(int[]a,int[]b) {
		int[]c=new int[a.length+b.length];
		
		for (int i = 0; i < a.length; i++) 
		{
			c[i]=a[i];
		}
		for (int i=0; i <b.length ; i++)
		{
			c[a.length+i]=b[i];
		}

		return c;
	}

}


