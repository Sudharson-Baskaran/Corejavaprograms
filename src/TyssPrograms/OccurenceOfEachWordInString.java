package TyssPrograms;

import java.util.LinkedHashSet;

public class OccurenceOfEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub method
		String s="where there is a will there is a way";
		String[] str = s.split(" ");
		LinkedHashSet<String>set=new LinkedHashSet<String>();
		for (int i = 0; i <str.length; i++) {
		   set.add(str[i]);
		}
        for (String s1 : set) {
        	int count=0;
        	
        	for (int i = 0; i < str.length; i++) {
        		
				if(s1.equalsIgnoreCase(str[i]))
				{
					count++;
				}
				
			}
        	System.out.println(s1+" no of occurence "+count);
			
		}
	}

}
