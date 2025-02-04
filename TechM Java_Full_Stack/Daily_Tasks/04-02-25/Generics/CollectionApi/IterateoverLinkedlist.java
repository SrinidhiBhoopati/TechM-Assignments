package CollectionApi;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class IterateoverLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to iterate through all elements in a linked list.
		 List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5);
	     LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
	     for(int num:linkedList)
	     {
	    	 System.out.println(num);
	     }

	}

}
