package Streams;

import java.util.Arrays;
import java.util.List;

public class LetterSpecific {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//. Write a Java program to count the number of strings in a list that
		//start with a specific letter using streams.
		List<String> list=Arrays.asList("karnataka","banglore","chennai","bhopal","bhuvaneshwar");
		char spc='b';
		long c=list.stream().filter(w->w.startsWith(String.valueOf(spc))).count();
		
		System.out.println(c);
	}

}
