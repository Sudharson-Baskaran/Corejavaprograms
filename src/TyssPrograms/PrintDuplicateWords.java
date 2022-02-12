package TyssPrograms;

import java.util.HashSet;

public class PrintDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello hello world";
		String[] s1 = s.split(" ");
		HashSet<String>set=new HashSet<String>();
		for (int i = 0; i < s1.length; i++) {
			set.add(s1[i]);
		}
for (String s2 : set) {
	int count=0;
	for (int i = 0; i < s1.length; i++) {
		if(s2.equals(s1[i]))
		{
			count++;
		}
	}
	if(count>1)
	{
		System.out.println(s2);
	}
}
	}

}
