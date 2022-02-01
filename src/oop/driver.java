package oop;

public class driver {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		employee e=new employee("anish",1,30000.0);
		e.setname("sudharson");
		displayDetails(e);
		//employee e2=new employee("sudharson",2,30000.35);
		//displayDetails(e2);
		

	}
	public static void displayDetails(employee e)
	{
		System.out.println("Name is:" +e.getname());
		System.out.println("Eid is:"+e.geteid());
		System.out.println("salary is:"+e.getsalary());
		e.work();
	}

}
