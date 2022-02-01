package programming;

import java.util.Scanner;

public class Driver26 {
	public static void main(String[] args) {
		double lowest=0;

		System.out.println("Enter number of employees");
		Scanner s=new Scanner(System.in);
		int empcount=s.nextInt();
		Employee25[] e=new Employee25[empcount];
		System.out.println("Enter employee details to add");
		for (int i = 0; i < e.length; i++) 
		{
			System.out.println("Enter "+(i+1)+" employee name");
			String name=s.next();
			System.out.println("Enter "+(i+1)+" eid ");
			int eid=s.nextInt();
			System.out.println("Enter "+(i+1)+" salary");
			double salary=s.nextDouble();
			e[i]=new Employee25(name,eid,salary);
		}

		for (int i = 1; i<empcount; i++) 
		{
			lowest=e[0].salary;
			if(e[i].salary<lowest)
			{
				lowest=e[i].salary;
			}
		}

		for (int i = 0; i < e.length; i++) 
		{
			if(e[i].salary==lowest)
			{
				System.out.println("Employee details who is getting least salary");
				System.out.println("Employee name is "+e[i].name);
				System.out.println("Employee eid is "+e[i].eid);
				System.out.println("Employee salary is "+e[i].salary);
				System.out.println("------------------------------------");
			}
		}

	}

}
