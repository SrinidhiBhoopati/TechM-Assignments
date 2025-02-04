package CollectionApi;

import java.util.ArrayList;

import java.util.List;

public class InsertingatFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  . Write a Java program to insert an element into the array list at the first position
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		System.out.println(list1);
		list1.add(0, 100);
		System.out.println(list1);
        //System.out.println(list1.indexOf(1));
	}

}
