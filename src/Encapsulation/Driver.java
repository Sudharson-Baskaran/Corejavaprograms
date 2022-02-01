package Encapsulation;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee("Sudharson",25000.0,"Automation test Engineer");
		e.designation="Developer";
		displayDetails(e);
		Employee e1=new Employee("Shaju",25000.0,"Software Developer");
		displayDetails(e1);
		Employee e2=new Employee("Godwinn",25000.0,"Project Manager");
		displayDetails(e2);

	}
	public static void displayDetails(Employee e)
	{
		System.out.println("Name is :"+e.getname());
		System.out.println("Salary is : "+e.getSalary());
		System.out.println("Designation is: "+e.getDesignation());
		e.work();
		System.out.println("------------------------------------");
	}

}
