package programming;

import java.util.LinkedHashSet;

public class Program30 {
	//wap to check the given sentence is panagram or not?

	public static void main(String[] args) {
		String s="A quick brown fox jumps over the lazy dog ";
		s=s.replace(" ","");
		s=s.toLowerCase();
	    char[]ch=s.toCharArray();
	    LinkedHashSet<Character > set=new LinkedHashSet<Character>();
	    for (int i = 0; i < ch.length; i++) {
	    	set.add(ch[i]);
			
		}
	    int count=0;
	    for (Character ch1 : set) {
	    	count++;
			
		}
	    if(count==26)
	    {
	    	System.out.println("It is panagram");
	    }
	    else
	    {
	    	System.out.println("Not a panagram");
	    }
	}
}


