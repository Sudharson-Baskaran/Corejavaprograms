package DecisionMakingStatements;



public class G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch=' ';
		if(ch>='A'&&ch<='Z')
		{
			System.out.println("A");
		}
		else if (ch>='a'&&ch<='z') {
			System.out.println("B");
		}
		else if (ch>='0'&&ch<='9') {
			System.out.println("c");
			
		}
		else if (ch==' ') {
			System.out.println("D");
			
		}
		else {
			System.out.println("Z");
		}
	}

}
