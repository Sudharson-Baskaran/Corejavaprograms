package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import array.E;

public class A implements Comparable {
	public int compareTo()
	{
	 return 0;	
	}
	public static void main(String[] args) {
		ArrayList<Integer>a=new ArrayList<Integer>();
		a.add(12101996);
		LinkedList< Integer>a1=new LinkedList<Integer>(a);
		int count = a1.size();
		System.out.println(count);
		for (int i = 0; i <count; i++) {
			System.out.println(a1.get(i));
		}
		}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	}


