package CollectionApi;

import java.util.LinkedList;

public class FirstandLst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//. Write a Java program to insert elements into the linked list at the first and last positions.
		 LinkedList<Integer> list = new LinkedList<>();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);
	        System.out.println(list);
	        list.addFirst(100);
	        list.addLast(200);
	        System.out.println(list);
	}

}
