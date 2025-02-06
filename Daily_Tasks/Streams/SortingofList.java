package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingofList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//. Write a Java program to sort a list of strings in alphabetical order, 
		//ascending and descending using streams.
		List<String> list=Arrays.asList("karnataka","banglore","chennai","bhopal","bhuvaneshwar","hyderabad");
		List<String> asc=list.stream().sorted().collect(Collectors.toList());
		List<String> dsc=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(asc);
		System.out.println(dsc);
		
	}

}
