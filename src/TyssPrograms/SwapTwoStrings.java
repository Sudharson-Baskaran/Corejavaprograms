package TyssPrograms;

public class SwapTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="java";
		String b="python";
		
		//Before Swapping
		System.out.println("Before Swapping"+" a = "+a+" , b = "+b);
		a=a+b;
		
		b=a.substring( 0 , a.length()-b.length());
		int size=b.length();
		a=a.substring(b.length());	
        System.out.println("After swapping a:"+a);
        System.out.println("After Swapping b:"+b);

	}

}
