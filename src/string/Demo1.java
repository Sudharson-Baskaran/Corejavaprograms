package string;

public class Demo1 {

	public static void main(String[] args) {
		String[]s= {"hello","hi","world","sudharson","Elyirampannai"};
		int[]arr=new int[s.length];
		for (int i = 0; i <s.length; i++) {
			int count=0;
			for (int j = 0; j <s[i].length(); j++) {
				s[i].charAt(j);
				count++;

			}
			arr[i]=count;

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("First maximum string length :"+arr[0]);
	}
}


