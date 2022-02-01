package Methods;

public class SumNubers {
	public static int sum(int a,int b) {
		int sum=0;
		for (int i = a; i <=b; i++) {
			sum+=i;
			}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=sum(1,10);
    System.out.println("Sum of all the numbers present in the given range is:"+a);
	}

}
