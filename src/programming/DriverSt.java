package programming;

import java.util.Scanner;

public class DriverSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of Students");
		int size=s.nextInt();
		Student[]st=new Student[size];
		System.out.println("Enter student details");
		for (int i = 0; i < st.length; i++) {

			System.out.println("Enter name ");
			String name=s.next();
			System.out.println("Enter rollno");
			int rollno=s.nextInt();
			System.out.println("Enter age");
			int age=s.nextInt();
			st[i]=new Student(name,rollno,age);
		}
		for (int j = 0; j < st.length; j++) {
			System.out.println("Student name is : "+st[j].name );
			System.out.println("Student rollno is : "+st[j].rollno );
			System.out.println("Student age is : "+st[j].age );
			System.out.println("-----------------------------------");

		}

	}

}
