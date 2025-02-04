package CollectionApi;

import java.util.Arrays;
import java.util.List;

public class UpdatinganElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to update an array element by the given element.
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		list1.set(0, 100);
		System.out.println(list1);
	}

}
