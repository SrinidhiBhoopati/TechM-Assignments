package CollectionApi;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class firstnlastoccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrayList = Arrays.asList(1, 2, 9,3, 4, 5,6,7,8,9);
	    LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
	    System.out.println("firstoccurence: "+linkedList.indexOf(9));
	    System.out.println("Lastoccurence: "+linkedList.lastIndexOf(9));

	}

}
