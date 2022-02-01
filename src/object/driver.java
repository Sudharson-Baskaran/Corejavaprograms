package object;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student s1=new student(1);
student s2=new student(1);
System.out.println(s1.equals(s2));
System.out.println(s1.hashcode());
System.out.println(s2.hashCode());
student s3=new student(4);
student s4=new student(4);
System.out.println(s3.equals(s4));
System.out.println(s3.hashcode());
System.out.println(s4.hashcode());

	}

}
