package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class MaxandMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to find the maximum and minimum values in a list of integers using streams.
		List<Integer> l1=Arrays.asList(1,2,3,5,2,3,4,6,2,6,7,8,4,5);
		OptionalInt max=l1.stream().mapToInt(Integer::intValue).max();
		OptionalInt min=l1.stream().mapToInt(Integer::intValue).min();
		System.out.println("max: "+max+" "+"min: "+min);
	}

}
