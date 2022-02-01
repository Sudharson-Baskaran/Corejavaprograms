package exceptionHandling;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter value a");
int a=s.nextInt();
System.out.println("Enter value b");
int b=s.nextInt();
try {
	int c=a/b;
	int[]d=null;
	System.out.println(d[0]);

}
catch(ArithmeticException e)
{
	
System.out.println("Arithmetic Exception handled Properly");
}
catch(NullPointerException e1)
{

System.out.println("Nullpointer exception handled properly");

}
catch(RuntimeException e2) {
System.out.println("Exception handled");
}
}
}