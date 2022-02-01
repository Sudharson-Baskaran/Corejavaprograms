package programming;

public class DisariumNumber  
{  static int n;
public static int length(int num)
{
	while (num>0)
	{
		num=num/10;
		n++;
	}
	return n;
}
public static int product(int num)
{
	int power=1;
	for (int i = 1; i <=n; i++) {
		power=power*num;

	}
	n--;

	return power;
}
public static void main(String[] args) {
	int num=89; int ld=0;
	int num1=num; int sum=0;
	int n=length(num);
	while(num>0)
	{
		ld=num%10;
		int pd=product(ld);
		sum=sum+pd;
		num=num/10;
	}
	System.out.println(sum);
	if(sum==num1)
	{
		System.out.println("Number is Disarium number");	

	}
	else
	{
		System.out.println("Number is not a Disarium number");
	}
}


}



