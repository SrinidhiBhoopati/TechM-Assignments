package CollectionApi;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Iteratefromspecificpostion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to iterate through all elements in a linked list
		//starting at the specified position.
		List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5,6,7,8,9);
	     LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
	     int pos=2;
	     for(int i=pos;i<linkedList.size()-1;i++)
	     {
	    	 System.out.println(linkedList.get(i));
	     }
	}

}
