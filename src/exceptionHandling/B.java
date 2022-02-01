package exceptionHandling;

public class B {
	public static void test()
	{
	int a=10;
	int b=0;
	int c=a/b;
	}

public static void main(String[] args) {
System.out.println("From main()");
try {
test();
}
catch(ArithmeticException e) {
System.out.println("Arithmetic exception handled properly");
}
}

}
