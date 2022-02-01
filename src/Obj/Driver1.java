package Obj;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student("Sudhasron",1);
Student s2=new Student("Anish",1);
//Student s2=s1;
System.out.println(s1.toString());
System.out.println(s2.toString());
System.out.println(s1.equals(s2));
	}

}
