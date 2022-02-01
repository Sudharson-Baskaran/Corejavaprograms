package programming;

public class Program19Array {
	
public static int countEven(int[] a)

{
	int count=0;
	for (int i = 0; i < a.length; i++) {
		if(a[i]%2==0)
		{
			count++;
		}
	}
	
	return count;
			
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {10,20,35,45,90,80};
int b=countEven(a);
System.out.println("Number of even numbers present in the array is: "+b );
	}

}
