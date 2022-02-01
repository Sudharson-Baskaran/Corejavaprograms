package programming;

public class SwappingNumbers {

	public static void main(String[] args) {
	int num=2415;
	int ld=0;
	
	while(num>0)
	{
		ld=num%10;
	
	    num=num/10;
	}
	System.out.println(ld);

	}

}
