package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//. Write a Java program to remove all duplicate elements from a list using streams.
		List<Integer> l1=Arrays.asList(1,2,3,5,2,3,4,6,2,6,7,8,4,5);
		List<Integer> l2=l1.stream().distinct().collect(Collectors.toList());
		System.out.println(l2);
	}

}
