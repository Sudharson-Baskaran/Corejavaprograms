package programming;

import java.util.ArrayList;
//Write a program to sort the array in ascending order?
public class Program22Array {

	public static void main(String[] args) {

		int[]a= {23,13,9,6,35,4};
		int d=a.length-1;

		for (int i = 0; i <a.length-1; i++) {
			for (int j = 0; j<d;j++){
				if(a[j]>a[j+1])
				{

					a[j]=a[j]+a[j+1];
					a[j+1]=a[j]-a[j+1];
					a[j]=a[j]-a[j+1];
				}
				else {
					continue;
				}

			}
			d--;

		}

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}
	}

}
