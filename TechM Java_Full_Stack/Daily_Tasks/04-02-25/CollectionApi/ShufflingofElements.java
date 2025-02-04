package CollectionApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShufflingofElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//. Write a Java program to shuffle elements in an array list.
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println("original list: "+list1);
		Collections.shuffle(list1);
		System.out.println("Shuffled list: "+list1);
		
	}

}
