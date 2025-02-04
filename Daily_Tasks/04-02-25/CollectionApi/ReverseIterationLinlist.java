package CollectionApi;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReverseIterationLinlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//. Write a Java program to iterate a linked list in reverse order.
		List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5,6,7,8,9);
	    LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
	    ListIterator<Integer> iterator = linkedList.listIterator(linkedList.size());
	    while(iterator.hasPrevious())
	    {
	    	System.out.println(iterator.previous());
	    }
	    

	}

}
