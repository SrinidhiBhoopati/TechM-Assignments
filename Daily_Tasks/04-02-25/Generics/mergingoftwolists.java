package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergingoftwolists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        	//. Write a Java program to create a generic method that takes two lists of the same type and merges them into a single list.
		//This method alternates the elements of each list.
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		List<Integer> list2 = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18);
		System.out.println(mergeList(list1,list2));
		
		
	}
	static <T> List<T> mergeList(List<T> l1,List<T> l2)
	{
		 List<T> merged = new ArrayList<>();
		int len1=l1.size();
		int len2=l2.size();
		int mergedsized=Math.max(len1, len2);
		for(int i=0;i<mergedsized;i++)
		{
			if(i<len1)
				merged.add(l1.get(i));
			
			if(i<len2)
				merged.add(l2.get(i));
				
				
		}
		return merged;
		
	}

}
