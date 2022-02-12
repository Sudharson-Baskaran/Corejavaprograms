package TyssPrograms;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to tyss";
		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j<arr[i].length(); j++) {
				if(j==0)
				{
					System.out.print(" "+(char)(arr[i].charAt(j)-32));
					j++;
				}
			System.out.print(arr[i].charAt(j));
			}
			
		}
	}

}
