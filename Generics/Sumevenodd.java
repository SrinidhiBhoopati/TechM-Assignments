package Generics;

import java.util.ArrayList;
import java.util.List;

public class Sumevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //. Write a Java program to create a generic method that takes a list
		//of numbers and returns the sum of all the even and odd numbers.
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		Sum(list);

	}
	public static<T extends Number> void Sum(List<T> Numbers)
	{
		int even=0;
		int odd=0;
		for(T num:Numbers)
		{
			if(num.intValue()%2==0)
				even+=num.intValue();
			else
				odd+=num.intValue();
		}
		System.out.println("evensum: "+even);
		System.out.println("oddsum: "+odd);
		
	}

}
