package Streams;

import java.util.Arrays;
import java.util.List;

public class Averageoflist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to calculate the average of a list of integers using streams.
		List<Integer> list=Arrays.asList(2,3,4,5,6,7);
		double avg=list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println(avg);
	}

}
