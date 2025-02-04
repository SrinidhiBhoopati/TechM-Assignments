package CollectionApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyingofElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//9. Write a Java program to copy one array list into another.
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);	
		List<Integer> l2=new ArrayList<>();
		l2.addAll(list1);
		System.out.println(l2);

	}

}
