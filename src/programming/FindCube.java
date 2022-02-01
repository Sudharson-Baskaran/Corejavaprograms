package programming;

public class FindCube {
	public static int cube(int num)
	{
		int c1 = (num*num*num);
		return c1;

	}

	public static void main(String[] args) {

		int num=2;
		int c=cube(num);
		System.out.println("cube value of "+num+" is: "+c );

	}

}
