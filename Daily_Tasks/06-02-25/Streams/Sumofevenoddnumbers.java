package Streams;

import java.util.Arrays;
import java.util.List;

public class Sumofevenoddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
		List<Integer> l1=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sumodd=l1.stream().filter(n->n%2!=0).mapToInt(Integer::intValue).sum();
		int evenodd=l1.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
		System.out.println("even sum: "+evenodd+"odd sum: "+sumodd);
		
		
	}

}
