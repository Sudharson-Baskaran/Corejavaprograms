package programming;

public class CheckCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		char[]ch= {'b','c','d'};
		for (int i = 0; i < ch.length; i++) {
	     if(ch[i]=='a')
	     {
	    	 count++;
	    	 System.out.println("Character 'a' is present in array");
	    	 break;
	     }
			
	   }
		if(count==0)
		{
			System.out.println("character 'a' is not present in array");
		}
		

	}

}
