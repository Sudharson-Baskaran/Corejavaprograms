
package array;

import java.util.Scanner;

public class K {

	public static void main(String[] args) {
	
        Object[]obj=new Object[5];
		System.out.println("Enter 5 values to storeinside array");
		Scanner s=new Scanner(System.in);
		for (int i = 0; i < obj.length; i++) {
			obj[i]=s.nextInt();
		}
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
	}

}
