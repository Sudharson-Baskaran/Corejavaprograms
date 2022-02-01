package DecisionMakingStatements;

import java.util.Scanner;

public class J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter number to check even or odd");
int num=sc.nextInt();
switch(num%2) {
case 0:System.out.println("Number taken is even");
break;
case 1:System.out.println("Number taken is odd");
break;
}
	}

}
