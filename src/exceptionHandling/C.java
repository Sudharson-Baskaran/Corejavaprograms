package exceptionHandling;

public class C {
public static void test1()
{
System.out.println("From test1()");
test2();
}
public static void test2()
{
System.out.println("From test2()");	
System.out.println(10/0);
}

public static void main(String[] args) {
System.out.println("From main()");
try
{
test1();	
}
catch(ArithmeticException e) {
	e.printStackTrace();
System.out.println("ArithmeticException Handled properly"+e.getCause());	
}
System.out.println("main()ended");
}
}