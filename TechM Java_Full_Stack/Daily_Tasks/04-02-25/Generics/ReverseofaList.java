package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseofaList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//. Write a Java program to create a generic method that takes a list of any type and
		//returns it as a new list with the elements in reverse order.
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println(Reverse(list1));
		
	}
	static <T> List<T>  Reverse(List<T> list1)
	{
		List<T> rev=new ArrayList<>();
		for(int i=list1.size()-1;i>=0;i--)
		{
			rev.add(list1.get(i));
		}
		return rev;
	}
	

}
