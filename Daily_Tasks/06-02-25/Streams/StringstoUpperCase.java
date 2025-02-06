package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringstoUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//. Write a Java program to convert a list of strings to uppercase or lowercase using streams.
		List<String> list=Arrays.asList("karnataka","banglore","chennai");
		List<String> l1=list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(l1);
	}

}
