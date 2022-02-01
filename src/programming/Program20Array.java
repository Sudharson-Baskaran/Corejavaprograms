package programming;

import java.util.Scanner;

public class Program20Array {

	public static void main(String[] args) {
		int[]a=readArray();
		int[]b=duplicateArray(a);
		System.out.println("Vaues of duplicate array");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}
	public static int[] readArray()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of ARRAY");
		int size=s.nextInt();
		int[]a=new int[size];
		System.out.println("Enter "+size+" values");
		for (int i = 0; i < size; i++) {
			a[i]=s.nextInt();
		}
		return a;
	}
	public static int[] duplicateArray(int[]a) {
		int[]b=new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i]=a[i];
		}
		return b;

	}
}