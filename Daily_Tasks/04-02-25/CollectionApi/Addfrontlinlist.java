package CollectionApi;

import java.util.LinkedList;

public class Addfrontlinlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//. Write a Java program to insert the specified element at the front of a linked list.
		 LinkedList<Integer> list = new LinkedList<>();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);
	        System.out.println(list);
	        list.addFirst(105);
	        System.out.println(list);
	}

}
