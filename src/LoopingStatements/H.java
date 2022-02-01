package LoopingStatements;

public class H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1245;
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
System.out.println("Number of digits present in the given number is:"+count);
	}

}
