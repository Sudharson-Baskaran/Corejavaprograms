package array;

public class J {
	public static int[] printEven(int a,int b)
	{
		int size=0;
		for(int i=a;i<=b;i++)
		{
			if(i%2==0)
			{
				size++;
			}
		}
		int[]c=new int[size];
		int j=0;
		for(int i=a;i<=b;i++) {
			if(i%2==0)
			{
				c[j]=i;
				j++;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[]a=printEven(10,50);
       for (int i = 0; i < a.length; i++) {
    	   System.out.println(a[i]);
		
	}
       
	}

}
