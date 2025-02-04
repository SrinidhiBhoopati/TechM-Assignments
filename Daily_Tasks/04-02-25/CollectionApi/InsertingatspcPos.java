package CollectionApi;

import java.util.LinkedList;

public class InsertingatspcPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to insert some elements at the specified position into a linked list.
		LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.add(1, 100);
        list.add(3, 300);
        list.add(5, 500);
        System.out.println(list);
	}

}
