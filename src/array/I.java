
package array;

public class I {
	public static int printOdd(int[]a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
		sum=sum+(a[i]*a[i]);	
			
		}
		return sum;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[]a=new int[10];
     for (int i = 0; i < a.length; i++) {
    	 a[i]=2*i+1;
		}
     int c=printOdd(a);
     System.out.println(c);
	}

}
