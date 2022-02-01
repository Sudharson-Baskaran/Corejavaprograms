package array;

public class F {
public static int largest(int[]a)
{
	int largest=0;
	for (int i = 0; i <a.length; i++) {
		if(a[i]>a[i+1]) {
			largest=a[i];
		}
		else {
			largest=a[i+1];
		}
		
	
	}
	
	return largest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a={50,20,30,40};
int l=largest(a);

System.out.println(l);
	}

}
