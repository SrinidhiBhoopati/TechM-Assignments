package CollectionApi;

import java.util.ArrayList;
import java.util.List;

public class RemovingofElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to remove the third element from an array list.
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		System.out.println(list1);
		list1.remove(2);
		System.out.println(list1);
	}

}
